package com.pluralsight.workbook3;

import java.util.Scanner;

public class FamousQuotes {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        boolean endProgram = true;
        while(endProgram) {
            try {
                System.out.println("Select a number between 1-10: ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                String[] quotes = loadQuotes();
                if (choice >= 1 && choice <= 10) {
                    System.out.println("Your quote: " + quotes[choice - 1]);
                } else {
                    System.out.println("Invalid. Choose a number 1-10.");
                }
            } catch (Exception e) {
                System.out.println("Invalid choice. Please enter a number 1-10.");
                scanner.nextLine();
            }

            System.out.println("Would you like to see another quote? (yes/no)");
            String answer = scanner.nextLine().trim();
            if(!answer.equals("yes")) {
                endProgram = false;
                System.out.println("Bye.");
            }
        }
    }

    public static String[] loadQuotes() {
        return new String[] {
                "What happened to the game I love? - Mark Jackson",
                "I will be there no matter what. - Kylian Mbappe",
                "That brother should be flipping burgers. - Russell Westbrook",
                "They wrote me off, I ain't write back tho. - Geno Smith",
                "I got one more in me. - Vince Carter",
                "Chris Paul hits a huge three to cut the lead down to 42",
                "The lights were brighter than expected. - Jarrett Allen",
                "Get ready to learn Chinese buddy. - Adam Silver",
                "If I say what I think I'll be suspended six months. - Mikel Arteta",
                "I owe you an apology. I wasn't really familiar with your game. - Shaquille O'Neal"
        };
    }
}

