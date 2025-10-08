package com.pluralsight.workbook3;

import java.util.ArrayList;
import java.util.List;

public class MiniListExercises {
    static void main() {
        List<String> names = new ArrayList<>();
        names.add("Phu");
        names.add("Jackson");
        names.add("Jacob");
        names.add("Tony");
        names.add("Ryland");
        names.add("Andrew");
        names.remove(2);

        for (String name : names) {
            System.out.println(name);
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);


        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) * 2);
            System.out.println(numbers.get(i));
        }
    }
}