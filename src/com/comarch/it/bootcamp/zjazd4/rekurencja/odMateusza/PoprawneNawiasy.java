package com.comarch.it.bootcamp.zjazd4.rekurencja.odMateusza;

import java.util.Scanner;
import java.util.Stack;

public class PoprawneNawiasy {
    /*
    Napisz metodę która dostaje jako paramter dowolny string. 
    Program ma sprawdzić czy string zawiera poprawne nawiasy - jeśli tak zwraca true, w przeciwnym wypadku false. 
    Przykład:
alskjd(asdfasd)asdf - true
asdf(asdf(asdf)asdf - false
sdfg(asd)asdf)asdf( - false

Zmienne typów prymitywnych trzymane są na tzw. stosie (stack),
natomiast obiekty, do których odnoszą się zmienne typów referencyjnych, tworzone są na stercie (heap).
push(znak):
push to operacja dodawania elementu na szczyt stosu.
Używamy stos.push(znak), aby dodać otwierający nawias '(') na szczyt stosu, gdy napotkamy taki znak w ciągu.
pop():
pop to operacja usuwania elementu ze szczytu stosu.
W naszym kodzie używamy stos.pop(), aby usunąć ostatni dodany otwierający nawias ze stosu, gdy napotkamy zamykający nawias ')'.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Napisz dowolne slowo zamierające nawiasy");
        String wyrazZNawiasami = scanner.next();

        if (sprawdzenieNawiasow(wyrazZNawiasami) == true) {
            System.out.println("Nawiasy są poprawne.");
        } else {
            System.out.println("Nawiasy nie są poprawne.");
        }
    }
    public static boolean sprawdzenieNawiasow (String wyrazZNawiasami){
        Stack<Character> stos = new Stack<>(); // nowy stos, który będzie przechowywał znaki. Możemy używać tego stosu do dodawania znaków na wierzch stosu (push) i usuwania ich z wierzchu (pop).

        for (char znak : wyrazZNawiasami.toCharArray()) {
            if (znak == '(') {
                stos.push(znak);
            } else if (znak == ')') {
                if (stos.isEmpty() || stos.pop() != '(') {
                    return false;
                }
            }
        }
        return stos.isEmpty();
    }
}