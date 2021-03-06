package com.tdarmo.data_structures_algorithms.algorithms.searching;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        if (this.root == null) {
            this.root = newNode;
            return;
        }

        Node currentNode = this.root;
        while (true) {
            if (value < currentNode.getValue()) {
                if (currentNode.getLeft() == null) {
                    currentNode.setLeft(newNode);
                    break;
                }
                currentNode = currentNode.getLeft();
            } else {
                if (currentNode.getRight() == null) {
                    currentNode.setRight(newNode);
                    break;
                }
                currentNode = currentNode.getRight();
            }
        }
    }

    public Node lookup(int value) {
        Node currentNode = this.root;

        while (currentNode != null) {
            if (value < currentNode.getValue()) {
                currentNode = currentNode.getLeft();
            } else if (value > currentNode.getValue()) {
                currentNode = currentNode.getRight();
            } else {
                return currentNode;
            }
        }

        return null;
    }

    public void remove(int value) {
        Node parentNode = this.root;

        while (true) {
            if (value < parentNode.getValue()) {
                if (parentNode.getLeft().getValue() == value) {
                    Node delete = parentNode.getLeft();
                    if (delete.getRight() == null) {
                        parentNode.setLeft(delete.getLeft());
                    } else if (delete.getRight().getRight() != null) {
                        Node rightChild = delete.getRight().getRight();
                        rightChild.setRight(delete.getRight());
                        rightChild.setLeft(delete.getLeft());
                        parentNode.setLeft(rightChild);
                    } else {
                        Node replace = delete.getRight();
                        replace.setLeft(delete.getLeft());
                        parentNode.setLeft(replace);
                    }

                    break;
                } else {
                    parentNode = parentNode.getLeft();
                }
            } else {
                if (parentNode.getRight().getValue() == value) {
                    Node delete = parentNode.getRight();
                    if (delete.getRight() == null) {
                        parentNode.setRight(delete.getRight());
                    } else if (delete.getRight().getRight() != null) {
                        Node rightChild = delete.getRight().getRight();
                        rightChild.setRight(delete.getRight());
                        rightChild.setLeft(delete.getLeft());
                        parentNode.setLeft(rightChild);
                    } else {
                        Node replace = delete.getRight();
                        replace.setLeft(delete.getLeft());
                        parentNode.setLeft(replace);
                    }

                    break;
                } else {
                    parentNode = parentNode.getRight();
                }
            }
        }
    }

    public List<Integer> breadthFirstSearch() {
        List<Integer> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(this.root);

        while (queue.size() > 0) {
            Node currentNode = queue.poll();
            list.add(currentNode.getValue());
            if (currentNode.getLeft() != null) {
                queue.add(currentNode.getLeft());
            }
            if (currentNode.getRight() != null) {
                queue.add(currentNode.getRight());
            }
        }

        return list;
    }

    public List<Integer> breadthFirstSearchR(Queue<Node> queue, List<Integer> list) {
        if (queue.size() == 0) return list;

        Node currentNode = queue.poll();
        list.add(currentNode.getValue());
        if (currentNode.getLeft() != null) {
            queue.add(currentNode.getLeft());
        }
        if (currentNode.getRight() != null) {
            queue.add(currentNode.getRight());
        }

        return this.breadthFirstSearchR(queue, list);
    }

    public List<Integer> DFSInorder() {
        return traverseInOrder(this.root, new ArrayList<>());
    }

    private List<Integer> traverseInOrder(Node node, List<Integer> list) {
        if (node.getLeft() != null) {
            traverseInOrder(node.getLeft(), list);
        }
        list.add(node.getValue());
        if (node.getRight() != null) {
            traverseInOrder(node.getRight(), list);
        }

        return list;
    }

    public List<Integer> DFSPreorder() {
        return traversePreorder(this.root, new ArrayList<>());
    }

    private List<Integer> traversePreorder(Node node, List<Integer> list) {
        list.add(node.getValue());
        if (node.getLeft() != null) {
            traversePreorder(node.getLeft(), list);
        }
        if (node.getRight() != null) {
            traversePreorder(node.getRight(), list);
        }

        return list;
    }

    public List<Integer> DFSPostorder() {
        return traversePostorder(this.root, new ArrayList<>());
    }

    private List<Integer> traversePostorder(Node node, List<Integer> list) {
        if (node.getLeft() != null) {
            traversePostorder(node.getLeft(), list);
        }
        if (node.getRight() != null) {
            traversePostorder(node.getRight(), list);
        }
        list.add(node.getValue());

        return list;
    }

    @Override
    public String toString() {
        return "BinarySearchTree {root: " + this.root + "}";
    }
}
