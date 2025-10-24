package com.pluralsight.workbook4.StaticExercises;

public class MainStaticExercises {
    static void main() {
        Cat cat = new Cat("Oreo");
        System.out.println(Cat.catCount);

        Cat cat2 = new Cat("Megatron");
        System.out.println(Cat.catCount);

        Cat cat3 = new Cat("Omega");
        System.out.println(Cat.catCount);

        int sum = MathHelper.add(3, 5);
        System.out.println(sum);

        int mh = new MathHelper().add(3, 5);
        System.out.println(mh);
    }
}
