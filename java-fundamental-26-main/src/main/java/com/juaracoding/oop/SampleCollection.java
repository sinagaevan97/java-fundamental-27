package com.juaracoding.oop;

import java.util.ArrayList;
import java.util.List;

public class SampleCollection {

    public static void main(String[] args) {
        
        List<String> cars = new ArrayList<String>();
        cars.add("Honda");
        cars.add("Mitsubisi");
        cars.add("Toyota");
        cars.add("Mazda");
        System.out.println(cars.get(1));
        System.out.println(cars);
        cars.remove(3);
        System.out.println(cars);



    }

}
