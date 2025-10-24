package com.pluralsight.workbook4.StaticExercises;

public class Cat {
    private String name;
    public static int catCount;

    public Cat(String name) {
        this.name = name;
        catCount++;
    }
}
