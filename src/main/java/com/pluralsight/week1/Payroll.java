package com.pluralsight.week1;

import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name: ");
        String name = scanner.nextLine();
        System.out.print("How many hours do you work: ");
        float hours = scanner.nextFloat();
        System.out.print("What is your pay rate: ");
        float payRate = scanner.nextFloat();
        float grossPay = hours * payRate;
        System.out.printf("Hi %s, your gross pay would be $%.2f.", name, grossPay);

    }
}
