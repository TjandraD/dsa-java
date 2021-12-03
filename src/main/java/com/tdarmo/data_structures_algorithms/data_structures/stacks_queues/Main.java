package com.tdarmo.data_structures_algorithms.data_structures.stacks_queues;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack("Google");
        myStack.push("Udemy");
        myStack.push("Discord");
        myStack.pop();
        System.out.println(myStack.peek());
        System.out.println(myStack.isEmpty());
    }
}
