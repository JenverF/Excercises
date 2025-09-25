package com.pluralsight.week1;
import java.util.Scanner;

public class BasicScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your favorite animal?");
        String animal = scanner.next();
        System.out.println("First tool that comes to mind");
        String tool = scanner.next();
        System.out.println("Day you were born");
        int day = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("Your favorite animal is %s, first tool that comes into mind is a %s and %d is the day you were born.", animal, tool, day);



    }
}
