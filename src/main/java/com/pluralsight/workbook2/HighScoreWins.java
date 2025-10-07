package com.pluralsight.workbook2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a game score: ");
        String input = scanner.nextLine().trim();

        String[] game = input.split(Pattern.quote("|"));
        String[] teams = game[0].split(Pattern.quote(":"));
        String[] scores = game[1].split(Pattern.quote(":"));

        int score1 = Integer.parseInt(scores[0]);
        int score2 = Integer.parseInt(scores[1]);

        if(score1 > score2) {
            System.out.println("Winner: " + teams[0]);
        } else if(score1 < score2){
            System.out.println("Winner: " + teams[1]);
        } else {
            System.out.println("Tie game");
        }
//        String[] scores1 = input.split(Pattern.quote("|"));
//        int teamscore1 = Integer.parseInt(scores1[0]);
//        int teamscore2 = Integer.parseInt(scores1[1]);
//        System.out.println(teamscore1 + teamscore2);

//        String input = "111|Hot Chocolate (12-count)|21|4.99";
//        String[] tokens = input.split(Pattern.quote("|"));
//        int id = Integer.parseInt(tokens[0]);
//        String name = tokens[1];
//        int quantity = Integer.parseInt(tokens[2]);
//        double price = Double.parseDouble(tokens[3]);
//        System.out.println(id + name + quantity + price);
    }
}
