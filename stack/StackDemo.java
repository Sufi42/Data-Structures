package com.bl.linkedlist.stack;

public class StackDemo {
    int arr[];
    int capacity;
    int top;

    StackDemo(int size) {
        capacity = size;
        arr = new int[size];
        top = -1;
    }
    public int push(int x) {
        if (isFull()) {
            System.out.println("Stack OverFlow");
        }
        return arr[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        }
        return arr[top--];
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == capacity - 1;
    }

    public void printStack() {
        for (int i = 0; i < capacity; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        StackDemo sd = new StackDemo(5);
        sd.push(1);
        sd.push(2);
        sd.push(3);
        sd.push(4);
        sd.printStack();
        sd.pop();
        sd.pop();
        System.out.println("After poping");
        sd.printStack();
    }
}
