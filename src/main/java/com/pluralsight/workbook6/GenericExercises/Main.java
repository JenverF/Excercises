package com.pluralsight.workbook6.GenericExercises;

public class Main {
    static void main() {
        Box<Integer> a = new Box<>(42);
        Box<String> b = new Box<>("hi");
        System.out.println(a.get()); // 42
        System.out.println(b.get()); // hi

        System.out.println("---------------------------");

        Holder<Double> h1 = new Holder<>(3.14);
        Holder<Character> h2 = new Holder<>('Z');
        h1.set(2.71);
        System.out.println(h1.get()); // 2.71
        System.out.println(h2.get()); // Z

        System.out.println("---------------------------");

        Labelled<String> l1 = new Labelled<>("name", "Maaike");
        Labelled<Integer> l2 = new Labelled<>("age", 29);
        System.out.println(l1); // name=Maaike
        System.out.println(l2); // age=29

        System.out.println("---------------------------");

        Printer<String> ps = new Printer<>();
        Printer<Boolean> pb = new Printer<>();
        ps.print("Hi");
        pb.print(true);

        System.out.println("---------------------------");

        OptionalLite<String> o1 = OptionalLite.of("x");
        OptionalLite<String> o2 = OptionalLite.empty();
        System.out.println(o1.isPresent()); // true
        System.out.println(o2.isPresent()); // false
    }
}
