package com.tdarmo.data_structures_algorithms.data_structures.arrays.reverse_string;

public class Reverse {
    public static void main(String[] args) {
        String reversed1 = reverse("Hi My name is Andrei");
        String reversed2 = reverse("I");
        System.out.println(reversed1);
        System.out.println(reversed2);
    }

    static String reverse(String str) {
        if (str.length() < 2) return str;

        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }
}
