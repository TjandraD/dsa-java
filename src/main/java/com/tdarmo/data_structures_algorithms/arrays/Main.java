package com.tdarmo.data_structures_algorithms.arrays;

public class Main {
    public static void main(String[] args) {
        final MyArray newArray = new MyArray();
        newArray.push("hi");
        newArray.push("you");
        newArray.push("!");
        newArray.delete(0);
        newArray.push("are");
        newArray.push("nice");
        newArray.delete(1);
        System.out.println(newArray);
    }
}
