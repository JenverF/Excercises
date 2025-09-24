package com.pluralsight.week1;

public class MathExcercises {
    public static void main(String[] args) {
        double number = 67;
        double doubled = number * 2;
        System.out.println(number);
        System.out.println(doubled);

        String name = "Jenver";
        int favoriteNumber = 67;
        System.out.println("My name is " + name + " and my favorite number is " + favoriteNumber);

        long randomNumber = Math.round(Math.random()* 10);
        System.out.println(randomNumber);
        randomNumber = randomNumber + 5;
        System.out.println(randomNumber);

        int hours = 41;
        int clockHours = hours % 24;
        System.out.println(hours + " hours later is " + clockHours + " o'clock");

        long minutes = 6767;
        long newHours = minutes / 60;
        long leftover = minutes % 60;
        System.out.println(minutes + " minutes = " + newHours + " hours and " + leftover + " minutes.");

        int nrHours = 3;
        int nrMinutes = 59;
        int minutesToAdd = 183;
        int newhours = (minutesToAdd + nrMinutes) / 60;
        int newmin = (minutesToAdd + nrMinutes) % 60;
        System.out.println("Start time: " + nrHours + ":" + nrMinutes);
        System.out.println("Minutes to add: " + minutesToAdd);
        System.out.println("Final time: " + (newhours + nrHours) + ":" + newmin);
    }
}
