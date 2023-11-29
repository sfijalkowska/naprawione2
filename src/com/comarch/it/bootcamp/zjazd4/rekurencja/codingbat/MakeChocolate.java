package com.comarch.it.bootcamp.zjazd4.rekurencja.codingbat;

import java.util.Scanner;

public class MakeChocolate {
    /*
We want make a package of goal kilos of chocolate.
We have small bars (1 kilo each) and big bars (5 kilos each).
Return the number of small bars to use, assuming we always use big bars before small bars.
Return -1 if it can't be done.

makeChocolate(4, 1, 9) → 4
makeChocolate(4, 1, 10) → -1
makeChocolate(4, 1, 7) → 2
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wymiar małej cegły: ");
        int small = scanner.nextInt();

        System.out.println("Podaj wymiar duzej cegły: ");
        int big = scanner.nextInt();

        System.out.println("Podaj goal: ");
        int goal = scanner.nextInt();

        System.out.println("Wynik: " + makeChocolate(small, big, goal));
    }

    public static int makeChocolate(int small, int big, int goal) {
        int potrzebneDuzeKawalki = goal / 5;
        if (potrzebneDuzeKawalki <= big) {
            goal -= potrzebneDuzeKawalki * 5;
        } else {
            goal -= big * 5;
        }
        if (goal <= small) {
            return goal;
        }
        return -1;
    }
}