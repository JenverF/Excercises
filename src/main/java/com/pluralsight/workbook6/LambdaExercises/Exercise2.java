package com.pluralsight.workbook6.LambdaExercises;

public class Exercise2 {
    static void main() {
        Greeter greeter = name -> System.out.println("Hi " + name + "! Have a great day!");
        greeter.greet("Jenver");
    }
}
