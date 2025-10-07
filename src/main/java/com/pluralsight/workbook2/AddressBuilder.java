package com.pluralsight.workbook2;

import java.util.Scanner;

public class AddressBuilder {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Full name: ");
        String name = scanner.nextLine();
        System.out.println("Billing Street: ");
        String street = scanner.nextLine();
        System.out.println("Billing City: ");
        String city = scanner.nextLine();
        System.out.println("Billing State: ");
        String state = scanner.nextLine();
        System.out.println("Billing Zip: ");
        String zip = scanner.nextLine();
        System.out.println("Shipping Street: ");
        String shippingStreet = scanner.nextLine();
        System.out.println("Shipping City: ");
        String shippingCity = scanner.nextLine();
        System.out.println("Shipping State: ");
        String shippingState = scanner.nextLine();
        System.out.println("Shipping Zip: ");
        String shippingZip = scanner.nextLine();

        StringBuilder add = new StringBuilder();
        add.append(name).append("\n\n");
        add.append("Billing Address: \n").append(street).append("\n");
        add.append(city).append(", ").append(state).append(" ").append(zip).append("\n\n");
        add.append("Shipping Address: \n").append(shippingStreet).append("\n");
        add.append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZip).append("\n");
        System.out.println(add);

//        StringBuilder skills = new StringBuilder();
//        // append strings to the StringBuilder object
//        skills.append("Git, ");
//        skills.append("HTML, ");
//        skills.append("CSS, ");
//        skills.append("and Bootstrap\n");
//        skills.append("JavaScript, ");
//        skills.append("ES6, ");
//        skills.append("jQuery, ");
//        skills.append("REST APIs, ");
//        skills.append("and Express\n");
//        skills.append("Angular\n");
//        skills.append("Java\n");
//        // retrieve the underlying characters from
//        // the StringBuilder
//        String mySkills = skills.toString();
//        System.out.println(mySkills);
    }
}
