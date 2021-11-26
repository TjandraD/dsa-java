package com.tdarmo.data_structures_algorithms.solve_interview_question;

public class Main {
    // [1, 2, 3, 9], Sum = 8
    // [1, 2, 4, 4], Sum = 8

    static boolean loopThroughArray(int[] numArray, int target) {
        for (int i = 0; i < numArray.length; i++) {
            for (int j = i + 1; j < numArray.length; j++) {
                if ((numArray[i] + numArray[j]) == target) return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 9};
        int[] secondArray = {1, 2, 4, 4};

        System.out.println(loopThroughArray(secondArray, 8));
    }
}
