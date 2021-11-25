package com.tdarmo.data_structures_algorithms.big_o;

import java.util.ArrayList;
import java.util.List;

public class SpaceComplexity {
    static void booooo(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.println("boooo!");
        }
    }

    static void arrayOfHiNTimes(int n) {
        List<String> hiArray = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            hiArray.add("hi");
        }
    }

    public static void main(String[] args) {
        booooo(new int[]{1, 2, 3, 4, 5}); // O(1)
        arrayOfHiNTimes(6); // O(n)
    }
}
