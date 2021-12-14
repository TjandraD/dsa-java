package com.tdarmo.data_structures_algorithms.algorithms.sorting;

import java.util.Arrays;

import static com.tdarmo.data_structures_algorithms.algorithms.sorting.Sort.*;

public class Main {
    public static void main(String[] args) {
        final int[] number = new int[]{99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        final int[] sortedNumber = mergeSort(number);
        System.out.println(Arrays.toString(sortedNumber));
    }
}
