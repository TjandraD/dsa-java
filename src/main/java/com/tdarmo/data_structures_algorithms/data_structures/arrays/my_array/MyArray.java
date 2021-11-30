package com.tdarmo.data_structures_algorithms.data_structures.arrays.my_array;

import java.util.Arrays;

public class MyArray {
    private int length = 0;
    private String[] data = new String[4];

    public MyArray(int length, String[] data) {
        this.length = length;
        this.data = data;
    }

    public MyArray() {
    }

    @Override
    public String toString() {
        return "MyArray { length: " + length + ", data: " + Arrays.toString(data) +" }";
    }

    public String get(int index) {
        return data[index];
    }

    public void push(String item) {
        data[length] = item;
        length++;
    }

    public void pop() {
        data[length - 1] = null;
        length--;
    }

    public void delete(int index) {
        shiftItems(index);
    }

    private void shiftItems(int index) {
        for (int i = index; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }
        pop();
    }
}
