package com.tdarmo.data_structures_algorithms.data_structures.hash_tables;

public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(50);
        hashTable.set("grapes", 10000);
        System.out.println(hashTable.get("grapes"));
    }
}
