package com.pluralsight.week1;

import static java.lang.Math.random;

public class MoreMethods {
    static void main(String[] args) {
        String playerTitle = getPlayerTitle("Phu");
        System.out.println(playerTitle);
        int OGexp = 10;
        int doubledexp = doubleXP(OGexp);
        System.out.println("Original XP: " + OGexp);
        System.out.println("Doubled XP: " + doubledexp);
        int threshold = 10;
        if(hasLeveledUp(doubledexp, threshold)) {
            System.out.println("You leveled up!");
        } else {
            System.out.println("Keep grinding.");
        }
        System.out.println("Rolling dice... " + rollDice());
        System.out.println("Rolling dice... " + rollDice());
        System.out.println("Rolling dice... " + rollDice());
        System.out.println(calculateDamage(5,12));

    }
    public static String getPlayerTitle(String name) {
        return "Unc " + name;
    }
    public static int doubleXP(int xp) {
        return xp * 2;
    }
    public static boolean hasLeveledUp(int currentXP, int threshold) {
        return currentXP >= threshold;
    }
    public static int rollDice() {
        return (int) Math.round(Math.random()* 6);
    }
    public static int calculateDamage(int strength, int enemyDefense) {
        return (strength * 2) - enemyDefense;
    }
}

