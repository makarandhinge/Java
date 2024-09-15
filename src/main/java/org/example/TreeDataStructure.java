package org.example;

public class TreeDataStructure {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Inserting nodes
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Print in-order traversal of the binary tree
        System.out.print("In-order traversal: ");
        tree.inorder();  // Output: 20 30 40 50 60 70 80
    }
}
class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}


class BinaryTree {
    Node root;

    // Constructor to create an empty binary tree
    public BinaryTree() {
        root = null;
    }

    // Method to insert nodes into the binary tree
    public void insert(int data) {
        root = insertRec(root, data);
    }

    // Recursive method to insert a new node with given data
    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    // In-order traversal of the binary tree
    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    // Other traversals like pre-order, post-order can be implemented similarly
}
