package com.comarch.it.bootcamp.zjazd4.rekurencja.codingbat;

import java.util.Scanner;

public class MakeBricks {
    /*
We want to make a row of bricks that is goal inches long.
We have a number of small bricks (1 inch each) and big bricks (5 inches each).
Return true if it is possible to make the goal by choosing from the given bricks.
This is a little harder than it looks and can be done without any loops.
See also: Introduction to MakeBricks

makeBricks(3, 1, 8) → true
makeBricks(3, 1, 9) → false
makeBricks(3, 2, 10) → true
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wymiar małej cegły: ");
        int small = scanner.nextInt();

        System.out.println("Podaj wymiar duzej cegły: ");
        int big = scanner.nextInt();

        System.out.println("Podaj goal: ");
        int goal = scanner.nextInt();

        System.out.println(makeBricks(small, big, goal));
    }

    public static boolean makeBricks(int small, int big, int goal) {
        int niezbedneDuzeKlocki = goal / 5;
        if (big >= niezbedneDuzeKlocki) {
            big = niezbedneDuzeKlocki;
        }
        int niezbedneMaleKlocki = goal - (big * 5);
        return small >= niezbedneMaleKlocki;
    }
}
