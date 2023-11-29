package com.comarch.it.bootcamp.zjazd4.rekurencja.codingbat;

import java.util.Scanner;

public class SumDigits {
    /*

Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters.
Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
Integer.parseInt(string) converts a string to an int.)


sumDigits("aa1bc2d3") → 6
sumDigits("aa11b33") → 8
sumDigits("Chocolate") → 0
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Napisz dowolny ciag znakow");
        String ciagznakow = scanner.next();

        System.out.println("Wynik: " + sumDigits(ciagznakow));

    }

    public static int sumDigits(String str) {
        int sum = 0;

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        return sum;
    }
}