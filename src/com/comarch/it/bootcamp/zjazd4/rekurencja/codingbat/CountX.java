package com.comarch.it.bootcamp.zjazd4.rekurencja.codingbat;

import java.util.Scanner;

public class CountX {
    /*

Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ciąg znaków zawierających znak 'x' (Bez spacji i znaków specjalnych:");
        String str = scanner.next();

        System.out.println("Liczba wystapien znaku 'x' w tekscie: " + str + " " + countX(str));
    }

    public static int countX(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        if (str.charAt(0) == 'x') {
            return 1 + countX(str.substring(1));
        } else {
            return countX(str.substring(1));
        }
    }
}
