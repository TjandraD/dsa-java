package com.tdarmo.data_structures_algorithms.data_structures.stacks_queues.queue;

public class Queue {
    private Node first;
    private Node last;
    private int length;

    public Queue() {
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    public String peek() {
        if (this.first == null) return "No item";
        return this.first.getValue();
    }

    public void enqueue(String value) {
        Node node = new Node(value);

        if (this.first == null) {
            this.first = node;
        } else {
            this.last.setNext(node);
        }

        this.last = node;
        this.length++;
    }

    public void dequeue() {
        if (this.length == 0) return;

        Node first = this.first.getNext();
        if (this.first == null) this.last = null;
        this.first = first;
        this.length--;
    }
}
