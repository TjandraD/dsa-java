package com.tdarmo.data_structures_algorithms.data_structures.hash_tables;

import java.util.HashMap;

public class FirstRecurringCharacter {
    public static void main(String[] args) {
        System.out.println(findRecurringCharacter1(new int[]{2, 5, 1, 2, 3, 5, 1, 2, 4}));
        System.out.println(findRecurringCharacter2(new int[]{2, 5, 1, 2, 3, 5, 1, 2, 4}));
    }

    public static int findRecurringCharacter1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) return array[i];
            }
        }

        return 0;
    }

    public static int findRecurringCharacter2(int[] array) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int num : array) {
            if (map.get(num) != null) {
                return num;
            } else {
                map.put(num, true);
            }
        }

        return 0;
    }
}
