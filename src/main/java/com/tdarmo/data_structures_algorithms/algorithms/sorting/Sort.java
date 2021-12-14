package com.tdarmo.data_structures_algorithms.algorithms.sorting;

public class Sort {
    static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j == array.length - 1) {
                    break;
                } else if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }

    static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallestItem = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (smallestItem > array[j]) {
                    int temp = array[j];
                    array[j] = smallestItem;
                    smallestItem = temp;
                }
            }

            array[i] = smallestItem;
        }

        return array;
    }
}
