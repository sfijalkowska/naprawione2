package com.comarch.it.bootcamp.zjazd4.rekurencja.codingbat;

import java.util.Scanner;

public class RepeatEnd {
    /*
    Kod bez używania metody repeate w klasie String
Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
You may assume that n is between 0 and the length of the string, inclusive.

repeatEnd("Hello", 3) → "llollollo"
repeatEnd("Hello", 2) → "lolo"
repeatEnd("Hello", 1) → "o"
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Napisz słowo:");
        String str = scanner.next();

        System.out.println("Powtórzone slowo: " + repeatEnd(str, 3));

    }

    public static String repeatEnd(String str, int n) {
        //return str.substring(str.length() - n).repeat(n);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(str.substring(str.length() - n));
        }

        return result.toString();
    }
}
