package org.example.DataStructure.Tree.NArry;
import java.util.*;


class NArrayNode<T>{
    T val;
    ArrayList<NArrayNode> children;

    NArrayNode(T val){
        this.val = val;
        this.children = new ArrayList<>();
    }

    }

public class NArrayTree<E> {
    NArrayNode<E> root;
    public void insertion(int val){
        if(root == null){
            root = new NArrayNode(val);
        }
        


    }

}
