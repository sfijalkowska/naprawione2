package com.comarch.it.bootcamp.zjazd4.rekurencja.odMateusza;

import java.util.Scanner;

public class ZmianaDziesietnychNaBinarne {
    /*
    Zamiana liczb dziesiętnych na binarne. Na tej stronie na początku macie pokazane jak zamienia się liczby dziesiętne na binarne:
    https://informatyk.edu.pl/systemy-liczbowe-system-binarny/.
    Napiszcie program który działa rekurencyjnie i wyświetla liczbę w systemie binarnym.

    W systemie binarnym aby sprowadzić liczbę dziesiętną do postaci binarnej, należy dokonać dzielenia przez 2.
    W tym przypadku liczbą dziesiętną będzie liczba 8.
    Dzielimy kolejne liczby przez 2, ustalając czy reszta jest równa 0 czy 1.
    Po wykonaniu ostatniego dzielenia, czyli podzielenia cyfry 1 przez 2 zapisujemy liczbę która nam powstała, pisząc od dołu do góry powstałe 1 oraz 0.
    Powstaje nam następująca liczba czyli: 1000.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe dziesietna:");
        int liczba = scanner.nextInt();

        System.out.println("Podana liczba dziesietna:" + " " + liczba + " po zamiane na system binarny wynosi: " + zmianaNaBinarny(liczba));
    }

    public static String zmianaNaBinarny(int liczba) {
        if (liczba == 0) {
            return "0";
        } else if (liczba == 1) {
            return "1";
        } else {
            return zmianaNaBinarny(liczba / 2) + liczba % 2;
        }
    }
}
