package com.tdarmo.data_structures_algorithms.big_o;

import java.util.Objects;

public class Main {
    static void findNemo(String[] array) {
        for (String s : array) {
            if (Objects.equals(s, "nemo")) System.out.println("Found NEMO!");
        }
    }

    static void logFirstTwoBoxes(int[] boxes) {
        System.out.println(boxes[0]); // O(1)
        System.out.println(boxes[1]); // O(1)
    }

    public static void main(String[] args) {
//        String[] nemo = {"nemo"};
//        String[] everyone = {"dory", "bruce", "marlin", "nemo", "gill", "bloat", "nigel", "squirt", "darla",
//                "hank"};
//        String[] large = new String[50000000];
//
//        findNemo(large); // O(n) --> Linear Time

        int[] boxes = {0, 1, 2, 3, 4, 5};

        logFirstTwoBoxes(boxes); // O(2)
    }
}
