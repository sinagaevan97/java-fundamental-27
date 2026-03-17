package com.juaracoding;

import java.util.Random;
import java.util.Scanner;

public class Percabangan {

    public static void main(String[] args) {
        
        if(false){
            System.out.println("Statement");
        }

        System.out.println("Next Statement");

        int bilangan = 11;
        if(bilangan % 2 == 1){ // 11 % 2 // 1 == 1
            System.out.println(bilangan + " adalah Bilangan Ganjil");
        } else {
            System.out.println(bilangan + " adalah Bilangan Genap");
        }

        int count = 0;
        int minRequest = 1;
        if(count < minRequest){
            System.out.println("minimal pembelian adalah 1");
        } else {
            System.out.println("tombol keranjang clickable");
        }

        int stock = 9;
        if (count > stock) {
            System.out.println("Jumlah order melebihi stok yang tersedia");
        } else if (count < minRequest) {
            System.out.println("Jumlah order tidak boleh kurang dari " + minRequest);
        } else {
            System.out.println("tombol keranjang clickable");
        }

        int total = 100000;
        // jika total belanja min 100000 maka dapat diskon 10%
        
        Random random = new Random(); 
        // Generates a number between 100000 and 999999 (inclusive of 100000)
        int otpValue = 100000 + random.nextInt(900000); 
        System.out.println(otpValue);   
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Silahkan input otp = ");
        int inputOtp = scanner.nextInt();
        if(inputOtp == otpValue) {
            System.out.println("Verifikasi berhasil");
        } else {
            System.out.println("OTP tidak valid");
        }

        String email = "juaracoding@gmail.com";
        System.out.println(email.equalsIgnoreCase("Juaracoding@gmail.com"));

        // switch
        System.out.println("Main Menu: ");
        System.out.println("1. Cek saldo");
        System.out.println("2. Deposit");
        System.out.println("3. Tarik tunai");
        System.out.println("4. Exit");
        System.out.println("Silahkan pilih menu [1-4]: ");
        int menu = scanner.nextInt();
        switch (menu) {
            case 1:
                System.out.println("Cek saldo");
                // Bisnis logic cek saldo
                break;
            case 2:
                System.out.println("Deposit");
                break;
            case 3:
                System.out.println("Tarik tunai");
                break;
            case 4:
                System.exit(0);
                break;
        
            default:
                System.out.println("Tidak pilihan menu tersebut");
                break;
        }

        // operator ternary ? :
        String attrType = "password";
        String iconEye = attrType.equals("password") ? "Hide Password" : "Show Password";
        System.out.println(iconEye);

    }

}
