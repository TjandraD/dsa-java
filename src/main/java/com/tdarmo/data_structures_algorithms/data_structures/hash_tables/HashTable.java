package com.tdarmo.data_structures_algorithms.data_structures.hash_tables;

import java.util.Arrays;

public class HashTable {
    private String[][][] data;

    public HashTable(int size) {
        data = new String[size][][];
    }

    private int hash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + Character.codePointAt(key, i) * i) % data.length;
        }

        return hash;
    }

    public void set(String key, int value) {
        int address = hash(key);
        int currentSize = 0;
        if (data[address] == null) {
            data[address] = new String[1][];
        } else {
            currentSize = data[address].length;
        }

        String[][] newItem = new String[currentSize + 1][];
        System.arraycopy(data[address], 0, newItem, 0, currentSize);
        newItem[currentSize] = new String[]{key, String.valueOf(value)};
        data[address] = newItem;
    }

    public String get(String key) {
        int address = hash(key);
        String[][] currentBucket = data[address];
        if (currentBucket != null) {
            for (String[] bucketItem : currentBucket) {
                if (bucketItem[0].equals(key)) return bucketItem[1];
            }
        }

        return "";
    }
}
