package com.pluralsight.week2;

import java.util.Scanner;

public class FullNameGenerator {
    static Scanner scanner = new Scanner(System.in);
    static void main(String[] args) {
        String firstName = enterFirstName();
        String middleName = enterMiddleName();
        String lastName = enterLastName();
        String suffix = enterSuffix();

        displayResults(firstName, middleName, lastName, suffix);
    }
    public static String enterFirstName() {
        System.out.println("First name: ");
        return scanner.nextLine().trim() ;
    }
    public static String enterMiddleName() {
        System.out.println("Middle name: ");
        return scanner.nextLine().trim();
    }
    public static String enterLastName() {
        System.out.println("Last name: ");
        return scanner.nextLine().trim();
    }
    public static String enterSuffix() {
        System.out.println("Suffix: ");
        return scanner.nextLine().trim();
    }
    public static void displayResults(String firstName, String middleName, String lastName, String suffix) {
        String fullName = firstName;

        if(!middleName.isEmpty()) {
            fullName = fullName + " " + middleName;
        }
        fullName = fullName + " " + lastName;
        if(!suffix.isEmpty()) {
            fullName = fullName + ", " + suffix;
        }

        System.out.println("Full name: " + fullName);
    }

}
