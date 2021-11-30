package com.tdarmo.data_structures_algorithms.data_structures.arrays.merge_sorted_arrays;

import java.util.Arrays;

public class SortedArrays {
    public static void main(String[] args) {
        int[] mergedSortedArray = mergeSortedArrays(new int[]{0, 3, 4, 31}, new int[]{4, 6, 30});
        System.out.println(Arrays.toString(mergedSortedArray));
    }

    static int[] mergeSortedArrays(int[] firstArray, int[] secondArray) {
        if (firstArray.length == 0) {
            return secondArray;
        } else if (secondArray.length == 0) {
            return firstArray;
        }

        int[] mergedArray = new int[firstArray.length + secondArray.length];

        for (int i = 0; i < mergedArray.length; i++) {
            int firstItem = firstArray[0];
            int secondItem = secondArray[0];

            if (firstItem > secondItem && secondItem >= 0) {
                mergedArray[i] = secondItem;
                removeItem(secondArray);
            } else if (secondItem > firstItem && firstItem >= 0) {
                mergedArray[i] = firstItem;
                removeItem(firstArray);
            } else {
                mergedArray[i] = firstItem;
                removeItem(firstArray);
            }
        }

        return mergedArray;
    }

    static void removeItem(int[] array) {
        if (array.length - 1 >= 0) System.arraycopy(array, 1, array, 0, array.length - 1);
        array[array.length - 1] = -1;
    }
}
