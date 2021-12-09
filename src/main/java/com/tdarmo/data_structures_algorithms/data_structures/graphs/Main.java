package com.tdarmo.data_structures_algorithms.data_structures.graphs;

public class Main {
    public static void main(String[] args) {

    }

    private static void defineGraph() {
        // Ways to define graph
        // Edge List
        // => list down all the relationships
        final int[][] edgeList = {{0, 2}, {2, 3}, {2, 1}, {1, 3}};

        // Adjacent List
        // => use index as node's value to shows the relationship
        final int[][] adjacentList = {{2}, {2, 3}, {0, 1, 3}, {1, 2}};

        // Adjacent Matrix
        // => shows relationship in binary
        final int[][] adjacentMatrix = {
                {0, 0, 1, 0},
                {0, 0, 1, 1},
                {1, 1, 0, 1},
                {0, 1, 1, 0}
        };
    }
}
