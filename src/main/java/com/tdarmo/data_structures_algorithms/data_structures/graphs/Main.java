package com.tdarmo.data_structures_algorithms.data_structures.graphs;

public class Main {
    public static void main(String[] args) {
        final Graph myGraph = new Graph();
        myGraph.addVertex("0");
        myGraph.addVertex("1");
        myGraph.addVertex("2");
        myGraph.addVertex("3");
        myGraph.addVertex("4");
        myGraph.addVertex("5");
        myGraph.addVertex("6");
        myGraph.addEdge("3", "1");
        myGraph.addEdge("3", "4");
        myGraph.addEdge("4", "2");
        myGraph.addEdge("4", "5");
        myGraph.addEdge("1", "2");
        myGraph.addEdge("1", "0");
        myGraph.addEdge("0", "2");
        myGraph.addEdge("6", "5");
        myGraph.showConnections();
    }

    private static void defineGraph() {
        // Ways to define graph
        // Edge List
        // => list down all the relationships
        final int[][] edgeList = {{0, 2}, {2, 3}, {2, 1}, {1, 3}};

        // Adjacent List
        // => use index as node"s value to shows the relationship
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
