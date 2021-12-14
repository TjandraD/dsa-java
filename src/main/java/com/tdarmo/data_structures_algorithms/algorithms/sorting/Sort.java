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

    static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) shiftItems(array, i);
        }

        return array;
    }

    static private void shiftItems(int[] array, int index) {
        int toShift = array[index];
        index--;
        while (index != -1 && array[index] > toShift) {
            array[index + 1] = array[index];
            index--;
        }
        array[index + 1] = toShift;
    }
}
