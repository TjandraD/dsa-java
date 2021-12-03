package com.tdarmo.data_structures_algorithms.data_structures.linked_lists;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myLinkedList = new DoublyLinkedList(10);
        myLinkedList.append(5);
        myLinkedList.append(16);
        myLinkedList.prepend(1);
        myLinkedList.insert(2, 99);
        System.out.println(myLinkedList.printList());
        myLinkedList.remove(2);
        System.out.println(myLinkedList.printList());
    }
}
