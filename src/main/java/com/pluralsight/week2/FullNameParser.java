package com.pluralsight.week2;

import java.util.Scanner;

public class FullNameParser {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String fullname = scanner.nextLine().trim();

        String[] name = fullname.split("\\s+");

        String firstname = "";
        String middlename = "(none)";
        String lastname = "";

        if(name.length == 2) {
            firstname = name[0];
            lastname = name[1];
        } else if(name.length == 3) {
            firstname = name[0];
            middlename = name[1];
            lastname = name[2];
        } else {
            System.out.println("Invalid");
            return;
        }

        System.out.println("First name: " + firstname);
        System.out.println("Middle name: " + middlename);
        System.out.println("Last name: " + lastname);
    }
}
