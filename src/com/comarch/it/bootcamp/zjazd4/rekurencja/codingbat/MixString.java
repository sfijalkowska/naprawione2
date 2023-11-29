package com.comarch.it.bootcamp.zjazd4.rekurencja.codingbat;

import java.util.Scanner;

public class MixString {
    /*
Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a,
the second char of b, and so on.
Any leftover chars go at the end of the result.
mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszy ciag znakow: ");
        String a = scanner.next();

        System.out.println("Podaj drugo ciag znakow: ");
        String b = scanner.next();

        System.out.println("Wynik połączenia ciągu " + a + " oraz ciagu " + b + " to: " + mixString(a, b));
    }

    public static String mixString(String a, String b) {
        StringBuilder wynik = new StringBuilder();
        int minLength = Math.min(a.length(), b.length());

        for (int i = 0; i < minLength; i++) {
            wynik.append(a.charAt(i)).append(b.charAt(i));
        }
            wynik.append(a.substring(minLength)).append(b.substring(minLength));
        return wynik.toString();
    }
}