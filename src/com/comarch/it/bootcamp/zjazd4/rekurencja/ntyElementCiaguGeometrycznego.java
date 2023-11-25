package com.comarch.it.bootcamp.zjazd4.rekurencja;

import java.util.Scanner;

public class ntyElementCiaguGeometrycznego {
    /*
    Program który wylicza n-ty element ciągu geometrycznego.
    Na wejściu program dostaje pierwszy wyraz ciągu, iloraz i numer wyrazu który ma wyliczyć.
    Krótka teoria jak działa ciąg geometryczny: https://pl.wikipedia.org/wiki/Ciąg_geometryczny.
    Przykład:
Wejście
3 2 5
Wynik
48

Z początkowej, rekurencyjnej definicji wynika wzór: an = a1 * q^(n-1)
Oznacza to, że przy dodatnich ilorazach ciąg geometryczny jest przykładem funkcji wykładniczej.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszy wyraz ciągu:");
        double pierwszyWyraz = scanner.nextDouble();

        System.out.println("Podaj iloraz ciągu:");
        double iloraz = scanner.nextDouble();

        System.out.println("Podaj numer wyrazu do wyliczenia:");
        int numerWyrazu = scanner.nextInt();

        System.out.println("n-ty element ciągu geometrycznego wynosi: " + ntyElementCiąguGeeometrycznego(pierwszyWyraz, iloraz, numerWyrazu));
    }
    public static double ntyElementCiąguGeeometrycznego (double pierwszyWyraz, double iloraz, int numerWyrazu){
        //an = a1 * q^(n-1)
        return pierwszyWyraz * Math.pow(iloraz, numerWyrazu - 1);
    }
}
