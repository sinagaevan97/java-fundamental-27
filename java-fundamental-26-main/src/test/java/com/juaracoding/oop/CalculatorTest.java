package com.juaracoding.oop;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.juaracoding.utils.excel.ExcelUtils;

public class CalculatorTest {

    Calculator calculator;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        calculator = new Calculator();
        System.out.println("Setup before running tests");
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        System.out.println("Running before each test method");
    }
    
    @DataProvider(name = "addData")
    public Object[][] addData() {
        return new Object[][]{
                {1, 1, 2},
                {0, 5, 5},
                {-1, 1, 0},
                {100, 200, 300},
                {5, 3, 8}
        };
    }

    @Test(dataProvider = "addData", priority = 1, groups = "math")
    public void testAdd(int a, int b, int expected) {
        int result = calculator.add(a, b);
        Assert.assertEquals(result, expected);
        System.out.println("Test add method passed for: " + a + ", " + b);
    }
    @DataProvider(name = "subtractData")
    public Object[][] subtractData() {
        String path = System.getProperty("user.dir") + "/src/test/resources/testdata/subtract-data.xlsx";
        return ExcelUtils.readExcelAsDataProvider(path, "Sheet1");
    }

    @Test(dataProvider = "subtractData", priority = 2, groups = "math")
    public void testSubtract(Object aObj, Object bObj, Object expectedObj) {
        int a = toInt(aObj);
        int b = toInt(bObj);
        int expected = toInt(expectedObj);
        int result = calculator.subtract(a, b);
        Assert.assertEquals(result, expected);
        System.out.println("Test subtract method passed for: " + a + ", " + b);
    }

    private int toInt(Object obj) {
        if (obj == null) return 0;
        if (obj instanceof Number) return ((Number) obj).intValue();
        try {
            return Integer.parseInt(obj.toString());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Cannot convert to int: " + obj, e);
        }
    }

    @Test(priority = 3)
    public void testMultiply() {
        int result = calculator.multiply(5, 3);
        Assert.assertEquals(result, 15);
        System.out.println("Test multiply method passed");
    }

    @Test(priority = 4)
    public void testDivide() {
        double result = calculator.divide(5, 2);
        Assert.assertEquals(result, 2.5);
        System.out.println("Test divide method passed");
    }

    @Test(priority = 5, dependsOnMethods = "testDivide", expectedExceptions = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(5, 0);
        System.out.println("Test divide by zero passed");
    }

}
