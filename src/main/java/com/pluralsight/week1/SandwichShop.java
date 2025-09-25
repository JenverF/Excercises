package com.pluralsight.week1;

import java.util.Scanner;

public class SandwichShop {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What size sandwich would you like? \nRegular: base price $5.45 \nLarge: base price $8.95");
        String sandwichSize = scanner.nextLine();
        System.out.println("Would you like your sandwich loaded? There is an additional cost. Yes or No \nRegular: $1.00 \nLarge: $1.75");
        String loaded = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();

        double price = 0;
        if(sandwichSize.equals("Large")) {
            price = 8.95;
            if(loaded.equals("Yes")) {
                price += 1.75;
            } else if(loaded.equals("No")) {
                price = 8.95;
            }
        } else if (sandwichSize.equals("Regular")) {
            price = 5.45;
            if(loaded.equals("Yes")) {
                price += 1.00;
            } else if(loaded.equals("No")) {
                price = 5.45;
            }
        } else {
            System.out.println("No sandwich for you");
        }
        if(age <= 17) {
            price *= .90;
        } else if(age >= 65) {
            price *= .80;
        }
        System.out.printf("The price of your sandwich will be $%.2f", price);
    }
}
