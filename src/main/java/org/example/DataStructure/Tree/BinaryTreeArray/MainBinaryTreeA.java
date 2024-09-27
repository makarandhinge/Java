package org.example.DataStructure.Tree.BinaryTreeArray;

public class MainBinaryTreeA {

    public static void main(String[] args){

        BinaryTreeA binaryTree = new BinaryTreeA(9 );
        binaryTree.insert("N1");
        binaryTree.insert("N2");
        binaryTree.insert("N3");
        binaryTree.insert("N4");
        binaryTree.insert("N5");
        binaryTree.insert("N6");
        binaryTree.insert("N7");
        binaryTree.insert("N8");
        binaryTree.insert("N9");



        binaryTree.deleteBT();
        System.out.println();
    }
}
