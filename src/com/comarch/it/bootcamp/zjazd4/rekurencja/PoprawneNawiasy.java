package com.comarch.it.bootcamp.zjazd4.rekurencja;

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
        
    }
    public static boolean sprawdzenieNawiasow (String wyrazZNawiasami){
        Stack<Character> stos = new Stack<>();

        for (char znak : wyrazZNawiasami.toCharArray()) {
            if (znak == '(' || znak == '{' || znak == '[') {
                stos.push(znak);
            } else if (znak == ')' || znak == '}' || znak == ']') {
                if (stos.isEmpty()) {
                    return false;
                }

                char otwierajacy = stos.pop();
                if (!((otwierajacy == '(' && znak == ')') || (otwierajacy == '{' && znak == '}') || (otwierajacy == '[' && znak == ']'))) {
                    return false;
                }
            }
        }

        return stos.isEmpty();
    }
}