package com.pluralsight.workbook2;

import java.util.Scanner;

public class FullNameGenerator {
    static Scanner scanner = new Scanner(System.in);
    static void main(String[] args) {
        String firstName = enterFirstName();
        String middleName = enterMiddleName();
        String lastName = enterLastName();
        String Suffix = enterSuffix();

        displayResults(firstName, middleName, lastName, Suffix);
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
    public static void displayResults(String firstName, String middleName, String lastName, String Suffix) {
        String fullName = firstName;

        if(!middleName.isEmpty()) {
            fullName = fullName + " " + middleName;
        }
        fullName = fullName + " " + lastName;
        if(Suffix.length() > 0) {
            fullName = fullName + ", " + Suffix;
        }

        System.out.println("Full name: " + fullName);
    }

}
