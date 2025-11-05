package com.pluralsight.workbook6.LambdaExercises;

public class Exercise3 {
    static void main() {
        Calculator add = (a, b) -> a - b;
        System.out.println(add.add(5, 3));

        Multiplier multiply = (a, b) -> a * b;
        System.out.println(multiply.multiply(6, 7));

        SquareCalculator sq = (x) -> {
            System.out.println("Calculating square...");
                return x * x;
        };
        System.out.println(sq.square(5));

        RandomPrinter pr = () -> System.out.println(Math.round(Math.random() * 10));
        pr.printRandom();

        Divider d = ((a, b) -> a / b);
        System.out.println(d.divide(84, 7));
    }
}
