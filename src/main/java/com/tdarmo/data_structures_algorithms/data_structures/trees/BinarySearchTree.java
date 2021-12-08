package com.tdarmo.data_structures_algorithms.data_structures.trees;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        this.root = null;
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

    @Override
    public String toString() {
        return "BinarySearchTree {root: " + this.root + "}";
    }
}
