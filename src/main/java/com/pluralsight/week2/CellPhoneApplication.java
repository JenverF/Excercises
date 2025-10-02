package com.pluralsight.week2;

import java.util.Scanner;

public class CellPhoneApplication {
    static Scanner scanner = new Scanner(System.in);
    static void main(String[] args) {
        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();

        System.out.println("Enter details for Cell Phone 1:");
        phoneCall(cellPhone1);
        System.out.println("Enter details for Cell Phone 2:");
        phoneCall(cellPhone2);

        display(cellPhone1);
        display(cellPhone2);

        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());
    }
    public static void phoneCall(CellPhone phone) {
        System.out.println("What is your serial number?");
        phone.setSerialNumber(scanner.nextLong());
        scanner.nextLine();
        System.out.println("What is the model of the phone?");
        phone.setModel(scanner.nextLine());
        System.out.println("Who's the carrier?");
        phone.setCarrier(scanner.nextLine());
        System.out.println("What is the phone nr?");
        phone.setPhoneNumber(scanner.nextLine());
        System.out.println("Who is the owner of the phone?");
        phone.setOwner(scanner.nextLine());

    }

    public static void display(CellPhone phone) {
        System.out.printf("The %s with serial number %d by carrier %s and phone nr %s is owned by %s\n", phone.getModel(), phone.getSerialNumber(), phone.getCarrier(), phone.getPhoneNumber(), phone.getOwner());
    }
}
