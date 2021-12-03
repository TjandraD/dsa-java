package com.tdarmo.data_structures_algorithms.data_structures.stacks_queues.stack;

public class Node {
    private String value;
    private Node next;

    Node(String value) {
        this.value = value;
        this.next = null;
    }

    public String getValue() {
        return value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }
}
