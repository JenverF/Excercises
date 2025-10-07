package com.pluralsight.workbook2;

public class LoopingExercises {
    static void main() throws InterruptedException {
//        whileLoop();
//        doWhileLoop();
        forLoop();
    }

    public static void whileLoop() {
        int i = 0;
        while (i < 5) {
            System.out.println("I love java");
            i++;
        }

    }

    public static void doWhileLoop() {
        int i1 = 0;
        do {
            System.out.println("I hate java");
            i1++;
        } while (i1 < 5);
    }

    public static void forLoop() throws InterruptedException {
        for (int count = 10; count >=1; count--) {
            Thread.sleep(1000);
            System.out.println(count);
        }
        System.out.println("Launch!");
    }
}