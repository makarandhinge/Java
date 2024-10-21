package org.example.Final450.BinaryTree;


class BinaryNode<T extends Comparable<T>>{
    T value;
    BinaryNode<T> left,right;

    public BinaryNode(T value){
        this.value = value;
        left = right = null;
    }


}

class BinaryTree<T extends Comparable<T>>{
    BinaryNode<T> root;
    public BinaryTree(){
        root = null;
    }

    public void insertion(T value){
       root = insertionProcess(root,value);
    }

    public BinaryNode<T> insertionProcess(BinaryNode<T> root, T value){
        if(root == null){
            root = new BinaryNode<>(value);
            return root;
        }
        if(root.value.compareTo(value) > 0) {
            root.left = insertionProcess(root.left,value);
        }
        if(root.value.compareTo(value) < 0){
            root.right = insertionProcess(root.right,value);
        }
        return root;
    }
}

public class BinaryTreeTesting{

    public static void main(String[] args) {

        BinaryTree<Integer> bst = new BinaryTree<>();
        bst.insertion(5);
        bst.insertion(4);
        bst.insertion(2);
        bst.insertion(2);
        bst.insertion(7);
        bst.insertion(9);

        System.out.println(bst.root.value);

    }


}
