package com.tdarmo.data_structures_algorithms.algorithms.dynamic_programming;

import java.util.HashMap;

public class FibonacciMemoization {
    HashMap<Integer, Integer> cache;

    public FibonacciMemoization() {
        this.cache = new HashMap<>();
    }

    public int recursiveFibonacci(int i) {
        if (i < 2) {
            return i;
        } else if (cache.get(i) != null) {
            return cache.get(i);
        } else {
            int result = recursiveFibonacci(i - 1) + recursiveFibonacci(i - 2);
            cache.put(i, result);
            return result;
        }
    }
}
