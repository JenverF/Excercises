package com.pluralsight.week1;

public class ConditionalsExercises {
    static void main(String[] args) {
        double number = -1;
        if (number > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Not positive");
        }
        double integer = 40;
        if (integer % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        double temperature = 64;
        if (temperature > 25) {
            System.out.println("Hot");
        } else {
            System.out.println("Not hot");
        }
        double teenagerAge = 20;
        if (teenagerAge >= 13 && teenagerAge <= 19) {
            System.out.println("Teenager");
        } else {
            System.out.println("Not a teenager");
        }
        double voterAge = 20;
        if (voterAge >= 18) {
            System.out.println("Can vote");
        } else {
            System.out.println("Too young to vote");
        }
        double num = 16;
        if(num % 3 == 0 && num % 5 == 0) {
            System.out.println("Divisble by 3 and 5");
        } else {
            System.out.println("Not divisible by 3 and 5");
        }
        double speed = 21;
        if (speed < 30 || speed > 100) {
            System.out.println("Unsafe speed");
        } else {
            System.out.println("Safe speed");
        }
        double leapYear = 2028;
        if(leapYear % 4 ==0 && leapYear % 100 != 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not leap year");
        }
        double a = 420;
        double b = 6769;
        if(a > b) {
            System.out.println("a is bigger");
        } else {
            System.out.println("b is bigger");
        }
        double score = 41;
        if(score >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
