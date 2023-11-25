package com.comarch.it.bootcamp.zjazd4.rekurencja;

import java.util.Scanner;

public class Count7 {
    /*
    Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops).
    Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

    count7(717) → 2
    count7(7) → 1
    count7(123) → 0
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nieujemna liczbe calkowita:");
        int n = scanner.nextInt();

        System.out.println("Liczba wystapien liczby 7: " + count7(n));
    }

    public static int count7(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 10 == 7) {
            return 1 + count7(n / 10);
        } else {
            return count7(n / 10);
        }
    }

}
