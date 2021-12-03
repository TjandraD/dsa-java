package com.tdarmo.data_structures_algorithms.data_structures.linked_lists;

import java.util.ArrayList;
import java.util.List;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    DoublyLinkedList(int value) {
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
        newNode.setPrevious(tail);
        tail.setNext(newNode);
        tail = newNode;
        length++;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        head.setPrevious(newNode);
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
        nextNode.setPrevious(newNode);
        previousNode.setNext(newNode);
        newNode.setNext(nextNode);
        newNode.setPrevious(previousNode);
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
            Node newHead = head.getNext();
            newHead.setPrevious(null);
            head = newHead;
            return;
        } else if (index >= length) {
            Node newTail = traverseToIndex(length - 2);
            newTail.setNext(null);
            tail = newTail;
            return;
        }

        Node previousNode = traverseToIndex(index - 1);
        Node currentNode = previousNode.getNext();
        Node nextNode = currentNode.getNext();
        previousNode.setNext(nextNode);
        nextNode.setPrevious(previousNode);
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
