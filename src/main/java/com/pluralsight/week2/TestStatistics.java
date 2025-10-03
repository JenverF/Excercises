package com.pluralsight.week2;

import java.util.Arrays;

public class TestStatistics {
    static void main() {
        int[] testScores = {85, 92, 78, 95, 67, 76, 91, 83, 89, 90};
        int sum = 0;

        for (int i = 0; i < testScores.length; ++i) {
            sum += testScores[i];
            System.out.println((i + 1) + ". " + testScores[i]);
        }
        double avg = (double) sum / testScores.length;
        Arrays.sort(testScores);
        int highScore = testScores[testScores.length - 1]; //last elem
        int lowScore = testScores[0];

        System.out.printf("""
                \nAverage score = %.2f
                Highest score = %d
                Lowest score = %d
                """, avg, highScore, lowScore);
    }
}
