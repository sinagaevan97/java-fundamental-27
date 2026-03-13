package com.juaracoding;

import com.juaracoding.oop.Fruit;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Juara!");

        int angka = 100;
        if(true){
            System.out.println("Scope IF");
            System.out.println(angka);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Scope FOR");
            System.out.println(angka);
        }

    }
}