package com.pluralsight.workbook4.JUnitTesting;

import java.util.Random;

public class Dice {
    private int lastRoll;
    private Random random;

    public Dice() {
        this.lastRoll = 0;
        this.random = new Random();
    }

    public int getLastRoll() {
        return lastRoll;
    }

    public int roll() {
        lastRoll = random.nextInt(6) + 1;
        return lastRoll;
    }
}
