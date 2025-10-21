package com.pluralsight.workbook4.HotelOperations;

import java.time.LocalTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked, double startTime) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.startTime = startTime;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getTotalPay() {
        return (getRegularHours() * payRate) + (getOvertimeHours() * payRate * 1.5);
    }

    public double getRegularHours() {
        return Math.min(40, hoursWorked);
    }

    public double getOvertimeHours() {
        return Math.max(0, hoursWorked - 40);
    }

    public void punchIn() {
        startTime = getTimeAsDouble();
    }


    public void punchIn(double time) {
        startTime = time;
    }

    public void punchOut() {
        hoursWorked += (getTimeAsDouble() - startTime);
    }

    public void punchOut(double time) {
        hoursWorked += (time - startTime);
    }

    public double getTimeAsDouble() {
        LocalTime lt = LocalTime.now();
        double hours = lt.getHour();
        double minutes = lt.getMinute() / 60.0;
        return hours + minutes;
    }
}
