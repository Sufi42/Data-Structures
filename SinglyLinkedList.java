package com.bl.linkedlist;

public class SinglyLinkedList {
    class Node {
        int data;
        Node nextNode;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node headNode = null;
    public Node tailNode = null;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (headNode == null) {
            headNode = tailNode = newNode;
        } else {
            tailNode.nextNode = newNode;
            tailNode = newNode;
            tailNode.nextNode = null;
        }
    }

    public void display() {
        Node current = headNode;
        if (headNode == null) {
            System.out.println("List is Empty");
        }

        while (current != null) {
            System.out.println(current.data + " ");
            current = current.nextNode;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList sl = new SinglyLinkedList();
        sl.addNode(1);
        sl.addNode(2);
        sl.addNode(3);
        sl.addNode(4);

        sl.display();
    }
}
