package com.juaracoding;

import java.util.Scanner;

public class Perulangan {

    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) { // 10 < 10
            System.out.println(i);
        }

        // 1 3 5 7 9
        for (int i = 1; i < 10; i+=2) {
            System.out.print(i);
        }

        System.out.println();

        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.print(i);
            }
        }

        System.out.println();

        for (int i = 1; i < 10; i++) {
            System.out.print(i);
            i++;
        }

        System.out.println();

        for (int i = 10; i > 0; i--) { // 0 > 0
            System.out.print(i);
        }

        System.out.println();

        // kotak
        int sisi = 5; // 5x5
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("*"); // **********
            }
            System.out.println();
        }

        // segitiga
        // *
        // **
        // ***
        // ****
        // *****
        for (int i = 1; i <= sisi; i++) {
            for (int j = 1; j <= i; j++) { // 1 <= 2
                System.out.print("*");
            }
            System.out.println();
        }

        // *****
        // ****
        // ***
        // **
        // *
        for (int i = sisi; i >= 1; i--) {  
            for (int j = 1; j <= i; j++) {  
                System.out.print("*");  
            }  
            System.out.println();  
        }

        for (int i = sisi; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        // while
        int x = 1;
        while (x < 1) {
            System.out.println("x = "+x);
            x++;
        }

        // do while
        int y = 1;
        do {
            System.out.println("y = "+y);
            y++;
        } while (y < 1);

        Scanner scanner = new Scanner(System.in);

        // login gagal 3x blokir sementara hub cs
        int batas = 3;
        boolean isBlocked = false;
        while (batas > 0) {
            System.out.println("Masukan username: ");
            String username = scanner.next();
            System.out.println("Masukan password: ");
            String password = scanner.next();

            if (username.equals("admin") && password.equals("Indonesia")) {
                System.out.println("Berhasil login");
                break;
            } else {
                System.out.println("Login gagal");
            }
            System.out.println(batas-1);
            batas--;
            if(batas == 0){
                isBlocked = true;
            }
        }

        if(isBlocked){
            System.out.println("Akun terblokir sementara hub cs");
        }


        // 10+20+30+40+50 = 150
        int sum = 0;
        while (true) {
            System.out.println("Silahkan input angka: ");
            int angka = scanner.nextInt();
            if (angka == 100) break;
            sum += angka; // sum = sum + angka
        }
        System.out.println("Total = "+sum);       


    }

}
