package com.pluralsight.workbook2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        String[] fullName = name.split(" ");

        System.out.println("What date will you be coming (MM/dd/yyyy): ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date= LocalDate.parse(scanner.nextLine(), formatter);

        System.out.println("How many tickets would you like: ");
        int tickets = scanner.nextInt();

        if(tickets == 1) {
            System.out.println("1 ticket reserved for " + date + " under " + fullName[1] + ", " + fullName[0]);
        } else {
            System.out.println(tickets + " tickets reserved for " + date + " under " + fullName[1] + ", " + fullName[0]);
        }
    }
}
