package com.tdarmo.data_structures_algorithms.algorithms.recursion;

public class Factorial {
    public static int findFactorialRecursive(int number) {
        if (number == 2) {
            return 2;
        }
        return number * findFactorialRecursive(number - 1);
    }

    public static int findFactorialIterative(int number) {
        if (number == 2) return 2;
        for (int i = number - 1; i > 1; i--) {
            number *= i;
        }
        return number;
    }
}
