package com.tdarmo.data_structures_algorithms.data_structures.linked_lists;

public class Main {
    public static void main(String[] args) {
        singlyLinkedList();
        doublyLinkedList();
    }

    public static void singlyLinkedList() {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.remove(1);
        myLinkedList.insert(4, 5);
        myLinkedList.insert(5, 5);
        myLinkedList.reverse();
        System.out.println(myLinkedList.printList());
    }

    public static void doublyLinkedList() {
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
