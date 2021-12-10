package com.tdarmo.data_structures_algorithms.algorithms.recursion;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    static int fibonacciIterative(int n) { // O(n)
        List<Integer> fibonacciList = new ArrayList<>();
        fibonacciList.add(0);
        fibonacciList.add(1);

        for (int i = 2; i <= n; i++) {
            fibonacciList.add(fibonacciList.get(i - 1) + fibonacciList.get(i - 2));
        }

        return fibonacciList.get(n);
    }

    static int fibonacciRecursion(int n) { // O(2^n)
        if (n < 2) {
            return n;
        }

        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }
}
