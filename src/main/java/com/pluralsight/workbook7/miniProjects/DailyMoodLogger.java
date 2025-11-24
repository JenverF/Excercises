package com.pluralsight.workbook7.miniProjects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class DailyMoodLogger {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while(isRunning) {
            String options = """
                    What would you like to do?
                        1) Log a new mood
                        2) View past moods
                        3) Exit
                    Select an option:""";
            System.out.println(options);
            String choice = scanner.nextLine();

            switch(choice) {
                case "1":
                    logMood(scanner);
                    break;
                case "2":
                    viewMoods();
                    break;
                case "3":
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }

    private static void logMood(Scanner scanner) {
        System.out.println("How are you feeling today?");
        String mood = scanner.nextLine();
        String entry = LocalDate.now() + ": " + mood;

        try (FileWriter writer = new FileWriter("files/moodlog.txt", true)) {
            writer.write(entry + "\n");
            System.out.println("Mood saved!");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    private static void viewMoods() {
        try (BufferedReader reader = new BufferedReader(new FileReader("files/moodlog.txt"))) {
            String line;
            System.out.println("\n--- Mood History ---");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
