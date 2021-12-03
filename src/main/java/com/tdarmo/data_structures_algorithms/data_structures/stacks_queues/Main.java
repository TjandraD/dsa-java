package com.tdarmo.data_structures_algorithms.data_structures.stacks_queues;

import com.tdarmo.data_structures_algorithms.data_structures.stacks_queues.stack.Stack;

public class Main {
    public static void main(String[] args) {
        stack();
    }

    public static void stack() {
        Stack myStack = new Stack("Google");
        myStack.push("Udemy");
        myStack.push("Discord");
        myStack.pop();
        System.out.println(myStack.peek());
        System.out.println(myStack.isEmpty());
    }
}
