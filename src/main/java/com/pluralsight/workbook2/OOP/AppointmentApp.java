package com.pluralsight.workbook2.OOP;

import java.time.LocalDate;

public class AppointmentApp {
    static void main() {
        Appointment apt = new Appointment();
        apt.setTitle("Check up");
        apt.setOrganizer("Dr. Phu");
        apt.setAttendee("Jenver");
        apt.setDate(LocalDate.now());
        apt.setLocation("");
        apt.printDetails();

        Appointment apt2 = new Appointment("Broken Leg", "Dr. House", "Jackson", LocalDate.now(), "Kaiser Permanente");
        apt2.printDetails();
    }
}
