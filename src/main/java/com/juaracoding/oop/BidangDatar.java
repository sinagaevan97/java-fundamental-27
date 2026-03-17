package com.juaracoding.oop;

public class BidangDatar {

    // method overriding
    void draw(){
        System.out.println("Default draw");
    }

}

class Segitiga extends BidangDatar {

    @Override
    void draw() {
        System.out.println("Gambar segitiga");
    }
    
}

class Lingkaran extends BidangDatar {

    @Override
    void draw() {
        System.out.println("Gambar lingkaran");
    }

}
