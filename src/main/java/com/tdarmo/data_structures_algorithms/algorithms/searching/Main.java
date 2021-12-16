package com.tdarmo.data_structures_algorithms.algorithms.searching;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(9);
        binarySearchTree.insert(4);
        binarySearchTree.insert(6);
        binarySearchTree.insert(20);
        binarySearchTree.insert(170);
        binarySearchTree.insert(15);
        binarySearchTree.insert(1);

        Node head = binarySearchTree.getRoot();
        Queue<Node> queue = new LinkedList<>();
        queue.add(head);
        List<Integer> list = new ArrayList<>();

        System.out.println(binarySearchTree.breadthFirstSearchR(queue, list));
    }
}
