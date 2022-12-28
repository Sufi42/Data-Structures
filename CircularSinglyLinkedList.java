package com.bl.linkedlist;

public class CircularSinglyLinkedList {
    class Node {
        public int data;
        Node nextNode;

        Node(int data) {
            this.data = data;
        }
    }

    public Node headNode = null;
    public Node tailNode = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (headNode == null) {
            headNode = newNode;
            tailNode = newNode;

        } else {
            tailNode.nextNode = newNode;
            tailNode = newNode;
            tailNode.nextNode = headNode;
        }
    }

    public void displayNode() {
        Node currentNode = headNode;
        if (headNode == null) {
            System.out.println("Empty");
        } else {
            System.out.println("Nodes in circular are : ");
        }
        do {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.nextNode;
        } while (currentNode != headNode);
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList cll = new CircularSinglyLinkedList();

        cll.addNode(1);
        cll.addNode(2);
        cll.addNode(3);
        cll.addNode(4);

        cll.displayNode();
    }
}
