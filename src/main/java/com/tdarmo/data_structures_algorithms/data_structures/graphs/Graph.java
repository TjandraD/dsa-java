package com.tdarmo.data_structures_algorithms.data_structures.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Graph {
    private int numberOfNodes;
    private final HashMap<String, List<String>> adjacentList;

    public Graph() {
        this.numberOfNodes = 0;
        this.adjacentList = new HashMap<>();
    }

    public void addVertex(String node) {
        if (this.adjacentList.get(node) != null) return;
        List<String> connections = new ArrayList<>();
        this.adjacentList.put(node, connections);
        this.numberOfNodes++;
    }

    public void addEdge(String node1, String node2) {
        if (this.adjacentList.get(node1) == null || this.adjacentList.get(node2) == null) return;
        List<String> connections1 = this.adjacentList.get(node1);
        connections1.add(node2);
        List<String> connections2 = this.adjacentList.get(node2);
        connections2.add(node1);
        this.adjacentList.put(node1, connections1);
        this.adjacentList.put(node2, connections2);
    }

    public void showConnections() {
        final Set<String> allNodes = this.adjacentList.keySet();
        for (String node : allNodes) {
            List<String> nodeConnections = this.adjacentList.get(node);
            StringBuilder connections = new StringBuilder();
            for (String vertex : nodeConnections) {
                connections.append(vertex).append(" ");
            }
            System.out.println(node + " --> " + connections);
        }
    }
}
