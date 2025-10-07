package com.pluralsight.workbook2.OOP;

import java.util.Scanner;

public class CellPhoneApplication {
    static Scanner scanner = new Scanner(System.in);
    static void main(String[] args) {
        CellPhone pc = new CellPhone();

        System.out.println("What is your serial number?");
        pc.setSerialNumber(scanner.nextLong());
        scanner.nextLine();
        System.out.println("What is the model of the phone?");
        pc.setModel(scanner.nextLine());
        System.out.println("Who's the carrier?");
        pc.setCarrier(scanner.nextLine());
        System.out.println("What is the phone nr?");
        pc.setPhoneNumber(scanner.nextLine());
        System.out.println("Who is the owner of the phone?");
        pc.setOwner(scanner.nextLine());

        CellPhone cp2 = new CellPhone(34234, "s22", "t-mobile", "088234234234", "Jenver");

        display(pc);
        display(cp2);
        pc.dial(cp2.getPhoneNumber());
        cp2.dial(pc);
    }

    public static void display(CellPhone pc) {
        System.out.printf("The %s with serial number %d by carrier %s and phone nr %s is owned by %s\n", pc.getModel(), pc.getSerialNumber(), pc.getCarrier(), pc.getPhoneNumber(), pc.getOwner());
    }
}
