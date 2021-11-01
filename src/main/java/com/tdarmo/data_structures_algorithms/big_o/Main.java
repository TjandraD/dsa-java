package com.tdarmo.data_structures_algorithms.big_o;

import java.util.Objects;

public class Main {
    static void findNemo(String[] array) {
        for (String s : array) {
            if (Objects.equals(s, "nemo")) System.out.println("Found NEMO!");
        }
    }

    public static void main(String[] args) {
        String[] nemo = {"nemo"};
        String[] everyone = {"dory", "bruce", "marlin", "nemo", "gill", "bloat", "nigel", "squirt", "darla",
                "hank"};
        String[] large = new String[50000000];

        findNemo(large); // O(n) --> Linear Time
    }
}
