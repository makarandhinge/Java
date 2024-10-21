package org.example.Final450.BinaryTree;

import java.util.*;

public class LevelOrderTraversal<T> {

    static class Node<T>{
        T data;
        Node<T> left,right;

        Node(T data){
            this.data = data;
            left = right = null;
        }
    }


    public ArrayList<T> levelOrderTraversal(Node<T> root){

        if(root == null){
            return null;
        }

        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(root);
        ArrayList<T> list = new ArrayList<>();
        while(!queue.isEmpty()){
            Node<T> presentNode = queue.poll();
            list.add(presentNode.data);
            if(presentNode.left != null){
                queue.add(presentNode.left);
            }
            if(presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        // Creating a binary tree of Integer type
        Node<Integer> root = new Node<>(7);
        root.left = new Node<>(9);
        root.right = new Node<>(4);
        root.left.left = new Node<>(9);
        root.left.right = new Node<>(2);


    }
}
