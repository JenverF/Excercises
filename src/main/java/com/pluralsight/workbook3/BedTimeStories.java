package com.pluralsight.workbook3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BedTimeStories {
    static Scanner scanner = new Scanner(System.in);
    static void main() {
        String story = storyPrompts();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("files/" + story));
            String line;
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static String storyPrompts() {
        String[] availableStories = {"goldilocks.txt", "hansel_and_gretel.txt", "mary_had_a_little_lamb.txt"};
        for(int i = 0; i < availableStories.length; i++) {
            System.out.println(i + ": " + availableStories[i]);
        }
        int storyChoice = scanner.nextInt();
        scanner.nextLine();
        return availableStories[storyChoice];
    }
}
