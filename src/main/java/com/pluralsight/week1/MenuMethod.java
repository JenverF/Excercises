package com.pluralsight.week1;

public class MenuMethod {
    static void main(String[] args) {
        displayMenu();
        displayMenu();
        String names = formatName("Phu", "Doan");
        System.out.println(names);
        boolean number = isEven(10);
        System.out.println(number);
        boolean num = isPositive(-11);
        System.out.println(num);

    }
    static void displayMenu() {
        System.out.println("=== MENU ===");
        System.out.println("1. Coffee - $3.99");
        System.out.println("2. Tea - $2.99");
        System.out.println("3. Cookie - $1.99");
    }
    static String formatName(String first, String last) {
        return last + ", " + first;
    }
    static boolean isEven(int number) {
        return number % 2 == 0;
    }
    static boolean isPositive(double number) {
        return number > 0;
    }
}
