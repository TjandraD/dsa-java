package com.tdarmo.data_structures_algorithms.data_structures.hash_tables;

public class HashTable {
    private int[][][] data;

    public HashTable(int size) {
        data = new int[size][][];
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
        if (data[address] == null) {
            data[address] = new int[1][];
        } else {
            int currentSize = data[address].length;
            int[][] newItem = new int[currentSize + 1][];
            System.arraycopy(data[address], 0, newItem, 0, currentSize);
            newItem[currentSize] = new int[]{address, value};
            data[address] = newItem;
        }
    }

    public int get(String key) {
        int address = hash(key);
        int[][] currentBucket = data[address];
        if (currentBucket != null) {
            for (int[] bucketItem : currentBucket) {
                if (bucketItem[0] == address) return bucketItem[1];
            }
        }

        return 0;
    }
}
