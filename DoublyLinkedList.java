package com.bl.linkedlist;

public class DoublyLinkedList {
    class Node{
        public int data;
        public Node preNode;
        public Node nextNode;
        public Node(int data){
            this.data = data;
        }
    }
    Node headNode = null ;
    Node tailNode = null;

    public void addNode(int data){
        Node newNode = new Node(data);
        if( headNode == null){
            headNode = tailNode = newNode;
            headNode.preNode = null;
            tailNode.nextNode = null;
        }
        else{
            tailNode.nextNode = newNode;
            newNode.preNode = tailNode;
            tailNode = newNode;
            tailNode.nextNode = null;
        }
    }
    public void display(){
        Node currentNode = headNode;
        if(headNode == null){
            System.out.println("Linked list is empty");
            return;
        }
            while(headNode != null){
                System.out.print(currentNode.data+"  ");
                currentNode = currentNode.nextNode;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addNode(1);
        dll.addNode(2);
        dll.addNode(3);
        dll.addNode(4);

        dll.display();
    }
}
