package com.pluralsight.workbook6.LambdaExercises;

public class Exercise1 {
    static void main() {
        Hello hello = () -> System.out.println("Hi from Java!");
        hello.sayHello();
    }
}
