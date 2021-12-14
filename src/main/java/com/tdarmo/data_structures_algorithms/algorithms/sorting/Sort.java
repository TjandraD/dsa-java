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

    static int[] mergeSort(int[] array) {
        int halfLength;
        if (array.length == 1) {
            return array;
        } else if (array.length % 2 == 0) {
            halfLength = array.length / 2;
        } else {
            halfLength = (array.length - 1) / 2;
        }

        
        int[] left = new int[halfLength];
        int[] right = new int[array.length - halfLength];
        for (int i = 0; i < array.length; i++) {
            if (i < left.length) {
                left[i] = array[i];
            } else {
                right[i - left.length] = array[i];
            }
        }

        return merge(mergeSort(left), mergeSort(right));
    }

    static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = 0; i < left.length + right.length; i++) {
            if (leftIndex < left.length && rightIndex < right.length && left[leftIndex] < right[rightIndex]) {
                result[i] = left[leftIndex];
                leftIndex++;
            } else if (leftIndex < left.length && rightIndex < right.length && right[rightIndex] < left[leftIndex]) {
                result[i] = right[rightIndex];
                rightIndex++;
            } else {
                if (leftIndex < left.length) {
                    result[i] = left[leftIndex];
                    leftIndex++;
                } else if (rightIndex < right.length) {
                    result[i] = right[rightIndex];
                    rightIndex++;
                }
            }
        }

        return result;
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
