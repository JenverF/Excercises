package com.pluralsight.workbook1;

import java.util.Scanner;

public class BasicCalulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double firstNum = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double secNum = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Possible calculations: \n(A)dd\n(S)ubtract\n(M)ultiply\n(D)ivide\nPlease select an option: ");
        String action = scanner.next();
        double result = firstNum * secNum;
        System.out.print(firstNum + " * " + secNum + " = " + result);
    }
}
