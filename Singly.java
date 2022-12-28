package com.bl.linkedlist;

public class Singly {
    class Node{
        int data;
        Node nextNode;

        Node(int data){
            this.data = data;
        }
    }
    Node headNode = null;
    Node tailNode = null;

   void addNode(int data){
       Node newNode = new Node(data) ;
           if(headNode == null){
               headNode = tailNode = newNode;
              tailNode.nextNode = newNode;
           }
           else{
               tailNode.nextNode = newNode;
               tailNode = newNode;
               tailNode.nextNode = null;
           }
    }
    void displayNode(){
       Node currentNode = headNode;
       if(headNode  == null ){
           System.out.println("List is empty");
       }
       else{
           System.out.println("List Elements are");
       }
       while(currentNode != null){
           System.out.print(currentNode.data+"  ");
           currentNode =currentNode.nextNode;
       }
    }

    public static void main(String[] args) {
        Singly s = new Singly();

        s.addNode(1);
        s.addNode(1);
        s.addNode(1);
        s.addNode(1);

        s.displayNode();
    }
}
