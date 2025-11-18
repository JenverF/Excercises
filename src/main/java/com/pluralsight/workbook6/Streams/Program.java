package com.pluralsight.workbook6.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();
        people.add(new Person("Jackson", "Bowling", 17));
        people.add(new Person("Jacob", "Sangalang", 20));
        people.add(new Person("Phu", "Doan", 19));
        people.add(new Person("Tony", "Luu", 18));
        people.add(new Person("Ryland", "Del Mundo", 18));

        System.out.println("Enter name to search for: ");
        String stringName = scanner.nextLine().trim().toLowerCase();

        List<Person> matches = people.stream()
                .filter(person -> person.getFirstName().equalsIgnoreCase(stringName) || person.getLastName().equalsIgnoreCase(stringName))
                .toList();
        System.out.println(matches);

    }
}
