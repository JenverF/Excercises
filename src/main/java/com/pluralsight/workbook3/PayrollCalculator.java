package com.pluralsight.workbook3;

import java.io.*;
import java.util.Scanner;

public class PayrollCalculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]) {
        try {
            System.out.println("Enter the name of the file employee file to process: ");
            String inputFileName = scanner.nextLine();

            System.out.println("Enter the name of the payroll file to create: ");
            String inputPayrollName = scanner.nextLine();

            String fileName = "files/" + inputFileName;
            String payrollName = "files/" + inputPayrollName;

            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufReader = new BufferedReader(fileReader);
            FileWriter writer = new FileWriter(payrollName);
            BufferedWriter bufWriter = new BufferedWriter(writer);

            bufWriter.write("id|name|gross pay");
            bufWriter.newLine();

            String input;
            bufReader.readLine();

            while((input = bufReader.readLine()) != null) {
                String[] parts = input.split("\\|");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                double hoursWorked = Double.parseDouble(parts[2]);
                double payRate = Double.parseDouble(parts[3]);

                Employee employee = new Employee(id, name, hoursWorked, payRate);
                bufWriter.write(String.format("%d|%s|%.2f", employee.getEmployeeId(), employee.getName(), employee.getGrossPay()));
                bufWriter.newLine();
            }
            System.out.println("Payroll file created successfully: " + payrollName);
            bufReader.close();
            bufWriter.close();
        } catch(IOException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}
