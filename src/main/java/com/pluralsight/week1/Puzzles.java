package com.pluralsight.week1;

public class Puzzles {
    public static void main(String[] args) {
        int a = 4, b = 6;
        System.out.println(a++ + ++b);
        int x = 5, y = 3, z = 2;
        System.out.println(x++ + ++y * z++);
        int eggs = 150, perBox = 12;
        System.out.println(eggs / perBox + " " + eggs % perBox);
        int n = 10;
        n += n++ + ++n;
        System.out.println(n);
        int p = 7;
        System.out.println(p++ + p++ + ++p);
        int u = 2, v = 5;
        System.out.println(++u * v-- - u++);
        int gold = 10, players = 3;
        double avg = gold / players;
        System.out.println(avg);
        int m = 5, d = 3;
        System.out.println(m / d * d + m % d);
        int lvl = 1;
        lvl = lvl++ + ++lvl + lvl;
        System.out.println(lvl);
        int A = 5, B = 3, C = 2;
        System.out.println(A++ * --B + C++ / B);
    }
}
