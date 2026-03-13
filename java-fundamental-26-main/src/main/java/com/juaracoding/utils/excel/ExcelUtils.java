package com.juaracoding.utils.excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    public static Object[][] readExcelAsDataProvider(String filePath, String sheetName) {
        try (InputStream is = new FileInputStream(filePath);
             Workbook wb = new XSSFWorkbook(is)) {

            Sheet sheet = (sheetName == null || sheetName.isEmpty()) ? wb.getSheetAt(0) : wb.getSheet(sheetName);
            if (sheet == null) {
                throw new IllegalArgumentException("Sheet not found: " + sheetName);
            }

            int rows = sheet.getPhysicalNumberOfRows();
            if (rows <= 1) {
                return new Object[0][];
            }
            Row header = sheet.getRow(0);
            int cols = header.getLastCellNum();

            Object[][] data = new Object[rows - 1][cols];

            for (int r = 1; r < rows; r++) {
                Row row = sheet.getRow(r);
                for (int c = 0; c < cols; c++) {
                    Cell cell = (row == null) ? null : row.getCell(c);
                    data[r - 1][c] = getCellValue(cell);
                }
            }

            return data;
        } catch (IOException e) {
            throw new RuntimeException("Failed to read Excel file: " + filePath, e);
        }
    }

    private static Object getCellValue(Cell cell) {
        if (cell == null) return null;
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) return cell.getDateCellValue();
                double d = cell.getNumericCellValue();
                if (d == (int) d) return (int) d;
                return d;
            case BOOLEAN:
                return cell.getBooleanCellValue();
            case FORMULA:
                return cell.getCellFormula();
            case BLANK:
                return null;
            default:
                return cell.toString();
        }
    }
}
