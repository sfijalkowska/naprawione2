package com.comarch.it.bootcamp.zjazd4.rekurencja.kolejkaPriorytetowa;

public class app {
    /*
    Kolejka priorytetowa. Napisz klase FIFOPriority która przechowuje Stringi.
    Kolejka ma działać zgodnie z zasadami kolejki FIFO jednak elementy mają mieć priorytety.
    Klasa posiada metodę push(String element, int priority).
    Metoda dodaje element na koniec kolejki z zadanym priorytetem (0 najmniejszy priorytet, 99 najwyższy priorytet).
    Klasa posiada metodę popFirst() zwracającą pierwszego stringa w kolejce,
    popHighThree() zwracającą jednego z 3 pierwszych Stringów - tego o najwyższym priorytecie najwyższym priorytecie,
    jeśli są dwa elementy o tym samym priorytecie zwracany jest ten który stoi bliżej "wyjścia" z kolejki.
    Klasa powinna posiadać również metodę popHighest() zwracajacą stringa o najwyższym priorytecie w całej kolejce.
    Jeśli jest wiecej niż jeden element o najwyższym priorytecie metoda zwraca element który stoi najbliżej "wyjścia" z kolejki.
     */
    public static void main(String[] args) {
        // Przykładowe użycie
        FIFOPriority fifoPriority = new FIFOPriority();

        // Dodaj kilka elementów do kolejki z różnymi priorytetami
        fifoPriority.push("Element 1", 5);
        fifoPriority.push("Element 2", 10);
        fifoPriority.push("Element 3", 2);

        // Zdejmij i wydrukuj pierwszego stringa w kolejce
        System.out.println(fifoPriority.popFirst()); // Powinno wydrukować "Element 1"

        // Zdejmij i wydrukuj jednego z 3 pierwszych Stringów o najwyższym priorytecie
        System.out.println(fifoPriority.popHighThree()); // Powinno wydrukować "Element 2"

        // Zdejmij i wydrukuj stringa o najwyższym priorytecie w całej kolejce
        System.out.println(fifoPriority.popHighest()); // Powinno wydrukować "Element 2"
    }
}