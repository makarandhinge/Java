package org.example.Final450.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrderTraversal<T> {

    // Generic Node class for the Binary Tree
    static class Node<T> {
        T data;
        Node<T> left, right;

        Node(T data) {
            this.data = data;
            left = right = null;
        }
    }

    // Function to perform reverse level order traversal
    public void reverseLevelOrderTraversal(Node<T> root) {
        if (root == null) {
            return;
        }

        // Stack to store the nodes in reverse order
        Stack<Node<T>> stack = new Stack<>();

        // Queue for normal level order traversal
        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(root);

        // Traverse the tree in level order
        while (!queue.isEmpty()) {
            Node<T> currentNode = queue.poll();
            stack.push(currentNode);  // Push the current node into the stack

            // Add the right child first, so left child will be processed first in reverse order
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }

            // Add the left child to the queue
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
        }

        // Print nodes in reverse order
        while (!stack.isEmpty()) {
            System.out.print(stack.pop().data + " ");
        }
    }

    // Main method for testing the reverse level order traversal
    public static void main(String[] args) {
        // Example 1
        Node<Integer> root1 = new Node<>(1);
        root1.left = new Node<>(3);
        root1.right = new Node<>(2);

        // Example 2
        Node<Integer> root2 = new Node<>(10);
        root2.left = new Node<>(20);
        root2.right = new Node<>(30);
        root2.left.left = new Node<>(40);
        root2.left.right = new Node<>(60);

        // Create ReverseLevelOrderTraversal object
        ReverseLevelOrderTraversal<Integer> traversal = new ReverseLevelOrderTraversal<>();

        // Perform reverse level order traversal for Example 1
        System.out.println("Example 1 Reverse Level Order Traversal:");
        traversal.reverseLevelOrderTraversal(root1); // Output: 3 2 1

        System.out.println("\nExample 2 Reverse Level Order Traversal:");
        traversal.reverseLevelOrderTraversal(root2); // Output: 40 60 20 30 10
    }
}
