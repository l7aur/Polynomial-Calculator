package org.example.processing;

public class Pair<T, G> {
    private T first;
    private G second;

    public Pair(T first, G second) {
        this.first = first;
        this.second = second;
    }
    public Pair() {
        this.first = null;
        this.second = null;
    }
    public T getFirst() {
        return first;
    }
    public G getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(G second) {
        this.second = second;
    }
}
