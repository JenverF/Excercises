package com.pluralsight.workbook5.Hogwarts;

public class Wizard {
    private String name;
    private String house;
    private int powerLevel;
    private String wandType;
    private Wand wand;  // Wizard HAS-A Wand

    static String school = "Hogwarts";  // All wizards share this

    public Wizard(String name, String house, int powerLevel) {
        this.name = name;
        this.house = house;
        this.powerLevel = powerLevel;
    }

    public static void welcomeMessage() {
        System.out.println("Welcome to " + school + "!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public String castSpell(String spell) {
        return name + " from " + house + " casts " + spell + " with a " + wand.getWood() + " wand containing a " + wand.getCore() + " core!";
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }
}
