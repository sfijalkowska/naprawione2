package com.comarch.it.bootcamp.zjazd4.rekurencja.codingbat;

import java.util.Scanner;

public class Blackjack {
    /*
Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.
blackjack(19, 21) → 21
blackjack(21, 19) → 21
blackjack(19, 22) → 19
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wartosc a: ");
        int a = scanner.nextInt();

        System.out.println("Podaj wartosc b: ");
        int b = scanner.nextInt();

        System.out.println(" Wynik: " + blackjack(a, b));
    }

    public static int blackjack(int a, int b) {
if (less21(a) >= less21(b)){
    return less21(a);
} else {
    return less21(b);
}
    }

    public static int less21(int n) {
        if (n <= 21) {
            return n;
        } else {
            return 0;
        }
    }
}