package com.pluralsight.workbook5.AssetManager;

import java.util.ArrayList;
import java.util.List;

public class AssetManagerMain {
    static void main() {
        List<Asset> myAssets = new ArrayList<>();

        myAssets.add(new House("My house", "2015-06-12", 250000,
                "123 Maple St", 2, 2000, 5000));

        myAssets.add(new Vehicle("My car", "2020-01-10", 30000,
                "Toyota Camry", 2020, 60000));

        for (Asset asset : myAssets) {
            System.out.println("-------------------------");
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: $" + asset.getOriginalCost());
            System.out.printf("Current Value: $%.2f%n", asset.getValue());

            String extraInfo = "";
            if (asset instanceof House) {
                House house = (House) asset;
                extraInfo = "Address: " + house.getAddress();
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                extraInfo = "Vehicle: " + vehicle.getYear() + " " + vehicle.getMakeModel();
            }

            System.out.println(extraInfo);
        }
    }
}
