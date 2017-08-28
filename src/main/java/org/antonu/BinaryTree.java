package org.antonu;

/**
 * Created by kit on 6/5/17.
 */
public class BinaryTree {

    private Node root;

    public void addNode(Integer key) {
        Node newNode = new Node(key);
        if (root == null) {
            root = newNode;
            return;
        }

        Node focusNode = root;

        Node parent;

        while (true) {
            parent = focusNode;

            if (key < focusNode.getKey()) {
                focusNode = focusNode.getLeftChild();
                if (focusNode == null) {
                    parent.setLeftChild(newNode);
                    return;
                }
            } else {
                focusNode = focusNode.getRightChild();
                if (focusNode == null) {
                    parent.setRightChild(newNode);
                    return;
                }
            }
        }
    }

    public void inOrederedTraversal(Node focusNode) {
        if (focusNode != null) {
            inOrederedTraversal(focusNode.getLeftChild());
            System.out.println(focusNode.toString());
            inOrederedTraversal(focusNode.getRightChild());
        }
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void dumpTree() {

    }

    private void doDumpTree(Node focusNode) {

    }

    public void preOrederedTraversal(Node focusNode) {
        if (focusNode != null) {
            System.out.println(focusNode.toString());
            preOrederedTraversal(focusNode.getLeftChild());
            preOrederedTraversal(focusNode.getRightChild());
        }
    }

    public void postOrederedTraversal(Node focusNode) {
        if (focusNode != null) {
            postOrederedTraversal(focusNode.getLeftChild());
            postOrederedTraversal(focusNode.getRightChild());
            System.out.println(focusNode.toString());
        }
    }
}

class Node {
    private Integer key;
    private Node leftChild;
    private Node rightChild;

    public Node(Integer key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                '}';
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
