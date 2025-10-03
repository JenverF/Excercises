package com.pluralsight.week2.OOP;

public class RollTheDice {
    static void main() {
        Dice dice = new Dice();

        int roll1;
        int roll2;
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        for(int roll = 0; roll <= 100; roll++) {
            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2;
            System.out.printf("Roll %d: %d - %d Sum: %d\n",roll, roll1, roll2, sum);

            if(sum == 2) {
                twoCounter++;
            } else if(sum == 4) {
                fourCounter++;
            } else if(sum == 6) {
                sixCounter++;
            } else if(sum == 7) {
                sevenCounter++;
            }
        }

        System.out.printf("Number of 2s rolled: %d\nNumber of 4s rolled: %d\nNumber of 6s rolled: %d\nNumber of 7s rolled: %d", twoCounter, fourCounter, sixCounter, sevenCounter);
    }
}
