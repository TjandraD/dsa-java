package com.tdarmo.data_structures_algorithms.data_structures.linked_lists;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    LinkedList(int value) {
        this.head = new Node(value);
        this.tail = this.head;
        this.length = 1;
    }

    @Override
    public String toString() {
        return "LinkedList { \nhead: " + head + ", \ntail: " + tail + ", \nlength: " + length + " }";
    }

    public void append(int value) {
        Node newNode = new Node(value);
        tail.setNext(newNode);
        tail = newNode;
        length++;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        newNode.setNext(head);
        head = newNode;
        length++;
    }

    public void insert(int index, int value) {
        if (index == 0) {
            prepend(value);
            return;
        } else if (index >= length) {
            append(value);
            return;
        }

        Node previousNode = traverseToIndex(index - 1);
        Node newNode = new Node(value);
        Node nextNode = previousNode.getNext();
        previousNode.setNext(newNode);
        newNode.setNext(nextNode);
        length++;
    }

    public Node traverseToIndex(int index) {
        int nodeIndex = 0;
        Node currentNode = head;
        while (index != nodeIndex) {
            currentNode = currentNode.getNext();
            nodeIndex++;
        }

        return currentNode;
    }

    public void remove(int index) {
        length--;
        if (index == 0) {
            head = head.getNext();
            return;
        } else if (index >= length) {
            Node newTail = traverseToIndex(length - 2);
            newTail.setNext(null);
            tail = newTail;
            return;
        }

        Node previousNode = traverseToIndex(index - 1);
        Node currentNode = previousNode.getNext();
        previousNode.setNext(currentNode.getNext());
    }

    public List<Integer> printList() {
        List<Integer> array = new ArrayList<>();
        Node currentNode = head;
        while (currentNode != null) {
            array.add(currentNode.getValue());
            currentNode = currentNode.getNext();
        }

        return array;
    }
}
