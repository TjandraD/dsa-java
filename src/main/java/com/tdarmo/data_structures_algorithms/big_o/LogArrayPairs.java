package com.tdarmo.data_structures_algorithms.big_o;

public class LogArrayPairs {
    static void logAllPairsOfArray(int[] boxes) {
        for (int box : boxes) {
            for (int i : boxes) {
                System.out.println(box + " " + i);
            }
        }
    }

    public static void main(String[] args) {
        final int[] boxes = {1, 2, 3, 4, 5};
        logAllPairsOfArray(boxes);
    }
}
