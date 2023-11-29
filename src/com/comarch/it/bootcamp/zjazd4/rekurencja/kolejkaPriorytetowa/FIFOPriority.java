package com.comarch.it.bootcamp.zjazd4.rekurencja.kolejkaPriorytetowa;

import com.comarch.it.bootcamp.zjazd4.rekurencja.kolejkaPriorytetowa.PriorityElement;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class FIFOPriority {
    private LinkedList<String> queue;
    private PriorityQueue<PriorityElement> priorityQueue;

    public FIFOPriority() {
        this.queue = new LinkedList<>();
        this.priorityQueue = new PriorityQueue<>();
    }

    // Dodaj element na koniec kolejki z zadanym priorytetem
    public void push(String element, int priority) {
        queue.add(element);
        priorityQueue.add(new PriorityElement(element, priority));
    }

    // Zwróć pierwszego stringa w kolejce
    public String popFirst() {
        if (!queue.isEmpty()) {
            priorityQueue.remove(new PriorityElement(queue.peek(), 0));
            return queue.poll();
        }
        return null;
    }

    // Zwróć jednego z 3 pierwszych Stringów o najwyższym priorytecie
    public String popHighThree() {
        PriorityElement[] highThree = new PriorityElement[3];
        for (int i = 0; i < 3; i++) {
            highThree[i] = priorityQueue.poll();
            if (highThree[i] == null) {
                break;
            }
        }
        for (PriorityElement element : highThree) {
            if (element != null) {
                queue.remove(element.getValue());
                priorityQueue.remove(element);
                return element.getValue();
            }
        }
        return null;
    }

    // Zwróć stringa o najwyższym priorytecie w całej kolejce
    public String popHighest() {
        PriorityElement highestPriority = priorityQueue.poll();
        if (highestPriority != null) {
            queue.remove(highestPriority.getValue());
            return highestPriority.getValue();
        }
        return null;
    }
}
