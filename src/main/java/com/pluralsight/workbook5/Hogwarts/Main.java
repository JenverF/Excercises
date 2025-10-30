package com.pluralsight.workbook5.Hogwarts;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<Wizard> wizards = new ArrayList<>();
        Wizard.welcomeMessage();

        Wand harryWand = new Wand();
        harryWand.setWood("Holly");
        harryWand.setCore("Phoenix feather");
        harryWand.setLength(11);

        Wand hermioneWand = new Wand();
        hermioneWand.setWood("Vine");
        hermioneWand.setCore("Dragon heartstring");
        hermioneWand.setLength(10.75);

        Wizard harry = new Wizard("Harry Potter", "Gryffindor", 95);
        Wizard hermione = new Wizard("Hermione Granger", "Gryffindor", 98);

        Professor snape = new Professor("Snape", "Slytherin", 95, "Potions");
        snape.teachSpell("Brew Polyjuice Potion");

        for (Wizard w : wizards) {
            Wand wand = w.getWand();
            System.out.println(w.getName() + "'s wand: " + wand.getWood() + ", " + wand.getCore() + ", " + wand.getLength());
        }
    }
}
