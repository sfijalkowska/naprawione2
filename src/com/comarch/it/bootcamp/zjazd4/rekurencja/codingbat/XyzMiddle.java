package com.comarch.it.bootcamp.zjazd4.rekurencja.codingbat;

import java.util.Scanner;

public class XyzMiddle {
    /*
    Given a string, does "xyz" appear in the middle of the string?
    To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one.
    This problem is harder than it looks.
xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Napisz słowo:");
        String str = scanner.next();

        System.out.println("XYZ pojawia się w srodku slowa?: " + xyzMiddle(str));
    }
    public static boolean xyzMiddle(String str) {
        int długoscStr = str.length();
        int srodek = str.length() / 2;


        if (długoscStr < 3) {
            return false;
        }
        if (długoscStr % 2 == 0) {
            return str.substring(srodek - 2, srodek + 1).equals("xyz") || str.substring(srodek - 1, srodek + 2).equals("xyz");
        } else {
            return str.substring(srodek - 1, srodek + 2).equals("xyz");
        }
    }
}
