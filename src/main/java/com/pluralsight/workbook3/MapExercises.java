package com.pluralsight.workbook3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExercises {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Phu Doan", "206-565-5646");
        phoneBook.put("Jackson Bowling", "951-246-3257");
        phoneBook.put("Ryland Del Mundo", "951-256-7893");

        System.out.println("Enter a name for their number.");
        for (String name : phoneBook.keySet()) {
            System.out.println(name);

        }
        String chosenName = scanner.nextLine();

        String number = phoneBook.get(chosenName);
        if(number != null) {
            System.out.println(chosenName + "'s number is " + number);
        } else {
            System.out.println("idk!");
        }
    }
}