package com.juaracoding.oop;

public class Fruit {

    int grams;
    int calsPerGram;

    int totalCalories() {
        return grams * calsPerGram;
    }

}
