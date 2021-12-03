package com.tdarmo.data_structures_algorithms.data_structures.stacks_queues;

public class Stack {
    private Node top;
    private Node bottom;
    private int length;

    Stack(String value) {
        this.top = new Node(value);
        this.bottom = this.top;
        this.length = 1;
    }

    public String peek() {
        if (this.top == null) return "No node in stack";
        return this.top.getValue();
    }

    public void push(String value) {
        Node node = new Node(value);
        node.setNext(this.top);
        this.top = node;

        if (this.length == 0) this.bottom = this.top;
        this.length++;
    }

    public void pop() {
        if (this.top == null) {
            return;
        } else if (this.top == this.bottom) {
            this.bottom = null;
        }
        
        Node toDelete = this.top;
        this.top = toDelete.getNext();
        this.length--;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }
}
