package com.comarch.it.bootcamp.zjazd4.rekurencja;

import java.util.Scanner;

public class BunnyEars2 {
    /*
    We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
    The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
    Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

bunnyEars2(0) → 0
bunnyEars2(1) → 2
bunnyEars2(2) → 5

1 2 3 4  5
2 3 2 3  2
2 5 7 10 12

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe kroliczkow:");
        int bunnies = scanner.nextInt();

        System.out.println("Liczba uszu: " + bunnyEars2(bunnies));

    }

    public static int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        if (bunnies % 2 == 0) {
            return 3 + bunnyEars2(bunnies - 1);
        } else {
            return 2 + bunnyEars2(bunnies - 1);
        }
    }
}
