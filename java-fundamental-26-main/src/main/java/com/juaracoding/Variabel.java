package com.juaracoding;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Variabel {

    public static void main(String[] args) {
        
        short stock = 9999;

        byte minRequest = 5;

        char size = 'L';

        String path = "C:\\Users\\Lenovo\\OneDrive\\Gambar";
        System.out.println(path);

        String productName = "ZOTAC GAMING NVIDIA GeForce RTX 5070 SOLID OC 12GB DDR7 - BLACK";

        boolean isAvailable = true;

        boolean isVerified = false;

        boolean isActive = true;

        LocalDate tanggalLahir = LocalDate.of(2006,12,12);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formatDate = tanggalLahir.format(formatter);
        System.out.println(formatDate);

        byte age = 100;

        char gender = 'F';

        // casting
        // automatic casting implicit
        byte data1 = 100;
        short dataShort = data1;

        int price = 16000;
        int qty = 2;
        double total = price * qty;

        // explicit
        long dataLong = 1000000000;
        short data2 = (short) dataLong;

        double nilai = 95.8; // 95.80
        byte dataByte = (byte) nilai;

        System.out.println(dataByte);

        int umur = 81;
        int duplikatUmur = umur;
        duplikatUmur = 1308;
        System.out.println(umur);
        System.out.println(duplikatUmur);

        Rectangle kotak = new Rectangle(0, 0, 20, 30);
        Rectangle duplikatKotak = kotak;
        duplikatKotak.setSize(80,90);
        System.out.println(kotak.getSize());
        System.out.println(duplikatKotak.getSize());


    }

}
