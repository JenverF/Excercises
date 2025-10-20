package com.pluralsight.workbook4.HotelOperations;

public class Hotel {
    static void main() {
        Room room = new Room(2, 150, true, true);
        System.out.println("Is room available? " + room.isAvailable());

        Reservation res = new Reservation("king", 7, true);
        System.out.printf("""
                Room type: %s
                Price per night: %.2f
                Total: $%.2f \n""", res.getRoomType(), res.getPrice(), res.getReservationTotal());

        Employee emp = new Employee(670, "Phu", "Front Desk", 21.25, 67);
        System.out.printf("""
                Employee Id: %d
                Name: %s
                Department: %s
                Pay Rate: $%.2f
                Hours Worked: %.2f
                Regular hours: %.2f
                Overtime hours: %.2f
                Total pay: $%.2f""", emp.getEmployeeId(), emp.getName(), emp.getDepartment(), emp.getPayRate(), emp.getHoursWorked(), emp.getRegularHours(), emp.getOvertimeHours(), emp.getTotalPay());
    }
}
