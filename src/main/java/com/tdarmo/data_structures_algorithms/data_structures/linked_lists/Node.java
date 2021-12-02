package com.tdarmo.data_structures_algorithms.data_structures.linked_lists;

public class Node {
    private int value;
    private Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }

    @Override
    public String toString() {
        return "{ value: " + value + ", next: " + next + " }";
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }
}
