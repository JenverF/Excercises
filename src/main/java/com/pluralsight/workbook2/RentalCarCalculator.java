package com.pluralsight.workbook2;

import java.util.Scanner;

public class RentalCarCalculator {
    static Scanner scanner = new Scanner(System.in);

    static void main(String[] args) {
        String pickUp = pickUpDate();
        int rentaldays = daysRental();
        String electronictoll = electronicTollTag();
        String gps = gpsInstall();
        String rsa = roadSideAssistance();
        int age = userAge();

        double basicCarRental = calcBasicRental(rentaldays);
        double optionsCost = calculateOptions(rentaldays, electronictoll, gps, rsa);
        double underageSurcharge = underageSurcharge(age, basicCarRental);
        double totalCost = totalCost(basicCarRental, optionsCost, underageSurcharge);

        displayCalculatedResults(pickUp, basicCarRental, optionsCost, underageSurcharge, totalCost);
    }

    public static String pickUpDate() {
        System.out.println("Please input pick up date");
        String pickUp = scanner.nextLine();
        return pickUp;
    }

    public static int daysRental() {
        System.out.println("How many days for the rental?");
        int rentaldays = scanner.nextInt();
        scanner.nextLine();
        return rentaldays;
    }

    public static String electronicTollTag() {
        System.out.println("Would you want an electric toll tag at $3.95/day? (yes/no)");
        String electronictoll = scanner.nextLine();
        return electronictoll;
    }

    public static String gpsInstall() {
        System.out.println("Would you want a GPS at $2.95/day? (yes/no)");
        String gps = scanner.nextLine();
        return gps;

    }

    public static String roadSideAssistance() {
        System.out.println("Would you want roadside assistance at $3.95/day? (yes/no)");
        String rsa = scanner.nextLine();
        return rsa;
    }

    public static int userAge() {
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();
        return age;
    }

    public static double calcBasicRental(int rentaldays) {
        return rentaldays * 29.99;
    }

    public static double calculateOptions(int rentalDays, String toll, String gps, String rsa) {
        double optionsCost = 0.0;
        if (toll.equalsIgnoreCase("yes")) {
            optionsCost += rentalDays * 3.95;
        }
        if (gps.equalsIgnoreCase("yes")) {
            optionsCost += rentalDays * 2.95;
        }
        if (rsa.equalsIgnoreCase("yes")) {
            optionsCost += rentalDays * 3.95;
        }
        return optionsCost;
    }

    public static double underageSurcharge(int age, double basicrental) {
        if (age < 25) {
            return basicrental * .30;
        }
        return 0.0;
    }

    public static double totalCost(double basicrental, double options, double underageSurcharge) {
        return basicrental + options + underageSurcharge;

    }

    public static void displayCalculatedResults(String pickUp, double basicrental, double optionsCost,
                                                double underageSurcharge, double totalCost) {
        System.out.println("Rental Car Estimate: ");
        System.out.println("Pickup Date: " + pickUp);
        System.out.printf("Basic Car Rental: $%.2f\n", basicrental);
        System.out.printf("Options Cost: $%.2f\n", optionsCost  );
        System.out.printf("Underage Driver Surcharge: $%.2f\n", underageSurcharge);
        System.out.printf("Total Cost: $%.2f\n", totalCost);
    }
}