package com.pluralsight.workbook2.OOP;

public class Dice {
    public int roll() {
        int minRoll = 1;
        int maxRoll = 6;
        int randomNumber = (int)(Math.random() * maxRoll) + minRoll;
        return randomNumber;
    }
}
