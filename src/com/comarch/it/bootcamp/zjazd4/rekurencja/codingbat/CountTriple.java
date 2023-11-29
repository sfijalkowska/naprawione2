package com.comarch.it.bootcamp.zjazd4.rekurencja.codingbat;

import java.util.Scanner;

public class CountTriple {
    /*
We'll say that a "triple" in a string is a char appearing three times in a row.
Return the number of triples in the given string. The triples may overlap.


countTriple("abcXXXabc") → 1
countTriple("xxxabyyyycd") → 3
countTriple("a") → 0
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Napisz słowo:");
        String str = scanner.next();

        System.out.println("Ilosc potworzen: " + countTriple(str));
    }

    public static int countTriple(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i + 1) != str.charAt(i + 2))
                i++;
            else if (str.charAt(i) == str.charAt(i + 1))
                count++;
        }
        return count;
    }
}
