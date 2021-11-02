package com.tdarmo.data_structures_algorithms.big_o;

public class BigOCalculation {
    static int funChallenge(String[] input) {
        int a = 10; // O(1)
        a = 50 + 3; // O(1)

        for (int i = 0; i < input.length; i++) { // O(n)
            anotherFunction(); // O(n)
            boolean stranger = true; // O(n)
            a++; // O(n)
        }

        return a; // O(1)
    }

    public static void main(String[] args) {
        funChallenge(); // O(3 + 4n)
    }
}
