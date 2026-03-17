package com.juaracoding.oop;

public class MainOOP {

    public static void main(String[] args) {
        
        Fruit orange = new Fruit();
        orange.grams = 1000/100;
        orange.calsPerGram = 47;
        System.out.println(orange.totalCalories());

        Fruit apple = new Fruit();
        apple.grams = 1500/100;
        apple.calsPerGram = 52;
        System.out.println(apple.totalCalories());

        Kotak kotak1 = new Kotak(5);
        kotak1.draw();
        System.out.println(kotak1.luas());

        Kotak kotak2 = new Kotak(10);
        kotak2.draw();
        System.out.println(kotak2.luas());

        // Encapsulation
        Karyawan karyawan1 = new Karyawan();
        karyawan1.setNama("Steve Job");
        karyawan1.setJabatan("CEO Apple");
        karyawan1.setSalary(10000);
        System.out.println(karyawan1.getNama());
        System.out.println(karyawan1.getJabatan());
        System.out.println(karyawan1.getSalary());

        // Polymorphism 
        Calculator calculator = new Calculator();
        calculator.sum(10, 5);
        calculator.sum(15, 10 ,5);

        BidangDatar bidangDatar = new BidangDatar();
        bidangDatar.draw();

        BidangDatar segitiga = new Segitiga();
        segitiga.draw();
        
        // Inheritance
        Manajer manajer1 = new Manajer();
        manajer1.setNama(null);
        manajer1.setJabatan(null);
        manajer1.setSalary(0);
        manajer1.setDivisi(null);
        
        // CRUD Mahasiswa use Collection List dan OOP encapsulation, polymorph
        // inheritance


    }

}
