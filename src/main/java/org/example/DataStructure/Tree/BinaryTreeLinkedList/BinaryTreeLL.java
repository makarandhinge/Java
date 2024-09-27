package org.example.DataStructure.Tree.BinaryTreeLinkedList;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class BinaryTreeLL {
    public BinaryNode root;

    public BinaryTreeLL(){
        this.root = null;
    }

    //Preorder traversal

    public void preOrder(BinaryNode node){
        if(node == null){
            return ;
        }

        System.out.print(node.value + " ");

        preOrder(node.left);
        preOrder(node.right);
    }

    //InOrder traversal

    void inOrder(BinaryNode node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value+ " ");
        inOrder(node.right);
    }

    //PostOrder Traversal

    void postOrder(BinaryNode node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    //Level Order Traversal

    void levelOrder(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if(presentNode.left != null){
                queue.add(presentNode.left);
            }
            if(presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
    }

    String search(String value){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.value == value){
                return "The " + value + " value is present in Binary Tree";
            }
            if(presentNode.left != null){
                queue.add(presentNode.left);
            }
            if(presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
        return "The " + value + " value is not present in Binary Tree";
    }

    // Insertion

    String insertion(String value){
        BinaryNode newNode = new BinaryNode();
        newNode.value = value;
        if(root == null){
            root = newNode;
            return "insert the value to root node";
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.left == null){
                presentNode.left = newNode;
                return "Successfully added to the node";
            }else{
                queue.add(presentNode.left);
            }
            if(presentNode.right == null){
                presentNode.right = newNode;
                return "Successfully added to the node";
            }else{
                queue.add(presentNode.right);
            }
        }
    return "SomeThing went wrong";
    }

    // Get the Deepest Node

    public BinaryNode deepestNode(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presentNode = null;

        while(!queue.isEmpty()){
            presentNode = queue.remove();
            if(presentNode.left != null){
                queue.add(presentNode.left);
            }
            if(presentNode.right != null){
                queue.add(presentNode.right);
            }
        }

        return presentNode;
    }

    // Delete the Deepest Node

    public void deleteDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode previousNode, presentNode = null;
        while(!queue.isEmpty()){
            previousNode = presentNode;
            presentNode = queue.remove();
            if(presentNode.left == null){
                previousNode.right = null;
                return;
            }else if(presentNode.right == null){
                presentNode.left = null;
                return;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }
    }

    // Delete the given node

    String deleteNode(String value){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.value == value){
                presentNode.value = deepestNode().value;
                deleteDeepestNode();
                return "Successfully deleted the " + value + " node!!";
            }else{
                if(presentNode.left != null) queue.add(presentNode.left);
                if(presentNode.right != null) queue.add(presentNode.right);
            }
        }
        return "The " + value + " node is not present in the binary tree!!";

    }

    void deleteBT(){
        root = null;
        System.out.println("Binary Tree is successfully deleted!!");
    }
}
