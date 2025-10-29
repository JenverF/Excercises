package com.pluralsight.workbook5.Vehicles;

public class VehiclesMain {
    static void main() {
        Moped slowRide = new Moped("Pink", 1, 0, 100);
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        System.out.println("Moped color: " + slowRide.getColor() + "\nFuel capacity: " + slowRide.getFuelCapacity());

        Car suv = new Car("Maroon", 6, 500, 100);
        System.out.printf("SUV color: %s \nNumber of Passengers: %d", suv.getColor(), suv.getNumberOfPassengers());

        SemiTruck semi = new SemiTruck("Optimus Prime", 2, 50000, 1000000);
        System.out.printf("\nSemi color: %s \nCargo Capacity: %d", semi.getColor(), semi.getCargoCapacity());
    }
}
