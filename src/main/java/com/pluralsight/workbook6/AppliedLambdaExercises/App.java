package com.pluralsight.workbook6.AppliedLambdaExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static List<Integer> filterNumbers(IntFilter filter, List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for(int n : numbers) {
            if(filter.filter(n)) {
                result.add(n);
            }
        }
        return result;
    }

    static void main() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        IntFilter evenFilter = (number) -> number % 2 == 0;
        List<Integer> evenNumbers = filterNumbers(evenFilter, numbers);
        System.out.println("Even numbers: " + evenNumbers);
    }
}
