package com.pluralsight.workbook4.StaticExercises;

public class Cat {
    private String name;
    private static int catCount = 0;

    public Cat(String name) {
        this.name = name;
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    public String getName() {
        return name;
    }
}
