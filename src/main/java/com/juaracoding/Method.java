package com.juaracoding;

public class Method {

    public static void main(String[] args) {
        
        // method tanpa parameter
        kotak();
        System.out.println();
        kotak();

        // method parameter
        segitiga(5);
        System.out.println();
        segitiga(10);

        // method return
        System.out.println(luasKotak(5));
        System.out.println(luasKotak(10));

        double[] prices = {40000,50000,160000};
        System.out.println(totalBayar(prices));

        String[] namaProduk = {"Asus", "MSI", "Colorful"};

        listProducts(namaProduk, prices);

        login("admin", "Indonesia");

    }

    public static void kotak(){
        int sisi = 5; 
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void segitiga(int sisi){
        for (int i = 1; i <= sisi; i++) {
            for (int j = 1; j <= i; j++) { // 1 <= 2
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int luasKotak(int sisi) {
        return sisi * sisi;
    }

    // diskon
    public static double kalkulasiDiskon(int diskon, double harga){
        return harga-harga*diskon/100;
    }

    // subtotal
    public static double subtotal(int qty, int harga, int diskon){
        // dapat diskon jika belanja 100000
        double total = qty * harga;
        if(total > 100000) {
            return kalkulasiDiskon(diskon, total);
        } else {
            return total;
        }
        
    }

    // total bayar param array prices
    public static double totalBayar(double[] prices) {
        double sum = 0;
        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];
        }
        return sum;
    }

    // list products
    public static void listProducts(String[] namaProduk, double[] harga){
        // Asus    100000
        // MSI      98000
        for (int i = 0; i < harga.length; i++) {
            System.out.printf("%d. %s Rp. %.2f%n", i+1, namaProduk[i], harga[i]);
        }
    }

    // method login
    public static void login(String username, String password) {
        if(username.equals("admin") && password.equals("Indonesia")) {
            System.out.println("Login berhasil");
            menuApp(1);
        } else {
            System.out.println("Login gagal");
        }
    }

    public static void menuApp(int menu){
        System.out.println("Daftar Menu:");
        System.out.println("1. List Produk");
        switch (menu) {
            case 1:
                double[] prices = {40000,50000,160000};
                String[] namaProduk = {"Asus", "MSI", "Colorful"};
                listProducts(namaProduk, prices);
                break;
            case 2:

                break;
            default:
                break;
        }
    }

}
