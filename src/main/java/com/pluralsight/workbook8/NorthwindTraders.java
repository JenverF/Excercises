package com.pluralsight.workbook8;

import java.sql.*;
import java.util.Scanner;

public class NorthwindTraders {
    static Scanner scanner = new Scanner(System.in);
    static void main(String[] args) {
        displayHomeScreen();;
        int choice = Integer.parseInt(getUserInput("Select an option:"));
        switch(choice) {
            case 1:
                displayAllProducts(args);
                break;
            case 2:
                displayAllCustomers(args);
                break;
            default:
                System.out.println("Not available now.");
        }
    }

    public static void displayHomeScreen() {
        String options = """
                What do you want to do?
                1) Display all products
                2) Display all customers
                0) Exit
                """;
        System.out.println(options);
    }

    public static String getUserInput(String text) {
        System.out.println(text);
        return scanner.nextLine();
    }

    public static void displayAllProducts(String[] args) {
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", args[0], args[1]);
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM products");
             ResultSet resultSet = statement.executeQuery()) {
            while(resultSet.next()) {
                int id = resultSet.getInt("ProductID");
                String name = resultSet.getString("ProductName");
                double price = resultSet.getDouble("UnitPrice");
                int stock = resultSet.getInt("UnitsInStock");
                System.out.printf("""
                        =====================================
                        ID: %d
                        Name: %s
                        Price: %f
                        Stock: %d
                        =====================================
                        """, id, name, price, stock);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void displayAllCustomers(String[] args) {
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", args[0], args[1]);
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM customers");
             ResultSet resultSet = statement.executeQuery()) {
            while(resultSet.next()) {
                String contactName = resultSet.getString("ContactName");
                String companyName = resultSet.getString("CompanyName");
                String city = resultSet.getString("City");
                String country = resultSet.getString("Country");
                String phone = resultSet.getString("Phone");
                System.out.printf("""
                        =====================================
                        Name: %s
                        Company: %s
                        City: %s
                        Country: %s
                        Phone: %s
                        =====================================
                        """, contactName, companyName, city, country, phone);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
