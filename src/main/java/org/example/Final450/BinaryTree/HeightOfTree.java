package org.example.Final450.BinaryTree;

public class HeightOfTree<T> {

    static class Node<T>{
        T data;
        Node<T> left,right;

        Node(T data){
            this.data = data;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        // Creating a binary tree of Integer type
        Node<Integer> root = new Node<>(7);
        root.left = new Node<>(9);
        root.right = new Node<>(4);
        root.left.left = new Node<>(9);
        root.left.right = new Node<>(2);

        HeightOfTree<Integer> intresult = new HeightOfTree<>();
        System.out.println(intresult.heightOfTree(root));
    }

    public int heightOfTree(Node node){
        if(node == null){
            return 0;
        }

        int h1 = heightOfTree(node.left);
        int h2 = heightOfTree(node.right);
        return Math.max(h1,h2) + 1;
    }
}
