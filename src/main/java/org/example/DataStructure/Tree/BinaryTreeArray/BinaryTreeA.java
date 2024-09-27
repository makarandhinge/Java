package org.example.DataStructure.Tree.BinaryTreeArray;

public class BinaryTreeA {

    String[] arr;
    int lastUsedIndex;

    public BinaryTreeA(int size) {
        arr = new String[size + 1];
        this.lastUsedIndex = 0;
        System.out.println("The size of " + size + " Binary Tree is created");
    }

    // Binary Tree is full
    public Boolean isFull() {
        if (arr.length - 1 == lastUsedIndex) {
            return true;
        } else {
            return false;
        }

    }

    // insert method

    void insert(String value) {
        if (!isFull()) {
            arr[lastUsedIndex + 1] = value;
            lastUsedIndex++;
            System.out.println("The "+ value +" is successfully added to the binary tree");
        }else{
            System.out.println("The Binary Tree is full");
        }
    }

    // pre order traversal

    void preOrder(int index){
        if(index > lastUsedIndex){
            return;
        }
         System.out.print(arr[index] + " ");
        preOrder(index * 2);
        preOrder(index * 2 + 1);

    }

    // in order traversal

    void inOrder(int index){
        if(index > lastUsedIndex){
            return;
        }
        inOrder(index * 2);
        System.out.print(arr[index] + " ");
        inOrder(index * 2 + 1);
    }

    // post order traversal

    void postOrder(int index){
        if(index > lastUsedIndex){
            return;
        }
        postOrder(index * 2);
        postOrder(index * 2 + 1);
        System.out.print(arr[index] + " ");
    }

    // level order traversal

    void levelOrder(){
        for(int i=1;i<=lastUsedIndex;i++){
            System.out.print(arr[i] + " ");
        }
    }

    // search method

    void search(String value){
        for(int i=1;i<=lastUsedIndex;i++){
            if(arr[i] == value){
               System.out.println("The index for " + value + " is " + i);
            }
        }
    }

    // delete the node

    void delete(String value){
        for(int i=1;i<=lastUsedIndex;i++){
            if(arr[i] == value){
                arr[i] = arr[lastUsedIndex];
                arr[lastUsedIndex--] = null;
                System.out.print("The " + value + " is successfully deleted");
                return;
            }
        }
        System.out.print("The " + value + " is not present in Binary tree");
    }

    // delete the binary tree

    void deleteBT(){
        try {
            arr = null;
            System.out.print("Successfully deleted the Binary Tree");
        }catch(Exception e){
            System.out.println("There was an error deleting the tree");
        }

    }

}
