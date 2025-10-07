package com.pluralsight.workbook2;

import java.util.Scanner;

public class NewPayroll {
    static Scanner scanner = new Scanner(System.in);
    static void main(String[] args) {
        String name = getName();

    }
    public static String getName() {
        System.out.println("What is your name: ");
        String name = scanner.next();
        return name;

    }
}
