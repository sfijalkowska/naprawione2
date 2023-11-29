package com.comarch.it.bootcamp.zjazd4.rekurencja.FIFO;

public class app {
    /*
     Kolejka FIFO. Napisz klasę FIFO która przechowuje Stringi, powinna mieć metody push(String element)
     która dodaje element do kolejki, oraz metodę pop() która zdejmuje i zwraca element z kolejki.
     Metody pop i push powinny działać zgodnie z zasami działani kolejki typu FIFO.
     */
    public static void main(String[] args) {
        FIFO fifo = new FIFO();

        fifo.push("Element1");
        fifo.push("Element2");
        fifo.push("Element3");

        System.out.println(fifo.pop());
        System.out.println(fifo.pop());

        fifo.push("Element4");

        System.out.println(fifo.pop());
        System.out.println(fifo.pop());
    }
}

