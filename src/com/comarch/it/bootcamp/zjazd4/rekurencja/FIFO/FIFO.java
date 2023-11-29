package com.comarch.it.bootcamp.zjazd4.rekurencja.FIFO;

import java.util.LinkedList;
import java.util.Queue;

public class FIFO {
    private Queue<String> queue;

    public FIFO() {
        this.queue = new LinkedList<>();
    }

    public void push(String element) {
        queue.offer(element);
    }

    public String pop() {
        return queue.poll();
    }
}
