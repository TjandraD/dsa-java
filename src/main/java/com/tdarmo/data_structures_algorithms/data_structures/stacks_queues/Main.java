package com.tdarmo.data_structures_algorithms.data_structures.stacks_queues;

import com.tdarmo.data_structures_algorithms.data_structures.stacks_queues.queue.Queue;
import com.tdarmo.data_structures_algorithms.data_structures.stacks_queues.stack.Stack;

public class Main {
    public static void main(String[] args) {
//        stack();
        queue();
    }

    public static void stack() {
        Stack myStack = new Stack("Google");
        myStack.push("Udemy");
        myStack.push("Discord");
        myStack.pop();
        System.out.println(myStack.peek());
        System.out.println(myStack.isEmpty());
    }

    public static void queue() {
        Queue myQueue = new Queue();
        myQueue.enqueue("Joy");
        myQueue.enqueue("Matt");
        myQueue.enqueue("Pavel");
        myQueue.enqueue("Samir");
        myQueue.dequeue();
        System.out.println(myQueue.peek());
    }
}
