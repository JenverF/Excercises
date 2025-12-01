package com.pluralsight.workbook8;

import java.sql.*;

public class NorthwindTraders {
    static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", args[0], args[1]);
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM products;";
            ResultSet resultSet = statement.executeQuery(query);

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

            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
