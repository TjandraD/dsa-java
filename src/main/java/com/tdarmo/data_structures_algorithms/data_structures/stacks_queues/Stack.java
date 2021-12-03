package com.tdarmo.data_structures_algorithms.data_structures.stacks_queues;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    final private List<String> data = new ArrayList<>();

    Stack(String value) {
        this.data.add(value);
    }

    public String peek() {
        if (this.data.size() == 0) return "No data in stack";
        return this.data.get(this.data.size() - 1);
    }

    public void push(String value) {
        data.add(value);
    }

    public void pop() {
        if (this.data.size() == 0) return;
        this.data.remove(this.data.size() - 1);
    }

    public boolean isEmpty() {
        return this.data.size() == 0;
    }
}
