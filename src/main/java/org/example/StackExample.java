package org.example;

class MyStack {
    private int maxSize;  // Maximum size of the stack
    private int[] stackArray;  // Array to store stack elements
    private int top;  // Index of the top element

    // Constructor
    public MyStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;  // Initially, stack is empty
    }

    // Push method to add an element to the stack
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed " + value);
        }
    }

    // Pop method to remove and return the top element
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;  // Error value
        } else {
            return stackArray[top--];
        }
    }

    // Peek method to view the top element
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;  // Error value
        } else {
            return stackArray[top];
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }
}

public class StackExample {
    public static void main(String[] args) {
        MyStack stack = new MyStack(3);  // Create a stack with max size 3

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);  // This will show "Stack is full."

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}

