package com.pluralsight.week1;

import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name: ");
        String name = scanner.nextLine();
        System.out.print("How many hours do you work: ");
        double hours = scanner.nextDouble();
        System.out.print("What is your pay rate: ");
        double payRate = scanner.nextDouble();
        double grossPay = 0;
        if(hours >= 40) {
            grossPay = (hours - 40) * payRate * 1.5 + 40 * payRate;
        } else {
            grossPay = payRate * hours;
        }
        System.out.printf("Hi %s, your gross pay would be $%.2f.", name, grossPay);

    }
}
