package com.comarch.it.bootcamp.zjazd4.rekurencja;

import java.util.Scanner;

public class AllStar {
    /*
    Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".

allStar("hello") → "h*e*l*l*o"
allStar("abc") → "a*b*c"
allStar("ab") → "a*b"
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ciąg znaków :");
        String str = scanner.next();

        System.out.println("Tekst po dodaniu '*': " + allStar(str));
    }

    public static String allStar(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            return str.charAt(0) + "*" + allStar(str.substring(1));
        }
    }
}
