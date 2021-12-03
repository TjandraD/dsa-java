package com.tdarmo.data_structures_algorithms.data_structures.linked_lists;

public class Node {
    private int value;
    private Node next;
    private Node previous;

    Node(int value) {
        this.value = value;
        this.previous = null;
        this.next = null;
    }

    @Override
    public String toString() {
        return "{ value: " + value + ", next: " + next + " }";
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrevious() {
        return previous;
    }
}
