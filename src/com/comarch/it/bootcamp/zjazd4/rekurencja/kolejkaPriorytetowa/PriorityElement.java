package com.comarch.it.bootcamp.zjazd4.rekurencja.kolejkaPriorytetowa;

public class PriorityElement implements Comparable<PriorityElement> {
    private String value;
    private int priority;
    private String queue;

    public PriorityElement(String value, int priority) {
        this.value = value;
        this.priority = priority;
    }

    public String getValue() {
        return value;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(PriorityElement other) {
        // Porównaj według priorytetu, a w przypadku równości według indeksu dodania do kolejki
        if (this.priority != other.priority) {
            return Integer.compare(other.priority, this.priority); // Od najwyższego do najniższego priorytetu
        } else {
            return Integer.compare(queue.indexOf(this.value), queue.indexOf(other.value)); // Od najwcześniejszego do najpóźniejszego dodania do kolejki
        }
    }
}