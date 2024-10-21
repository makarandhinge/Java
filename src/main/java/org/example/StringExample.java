package org.example;

import java.util.*;

public class StringExample {

    public static void main(String[] args) {
        int v = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
        }


        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(5);
        adj.get(2).add(4);
        adj.get(2).add(3);
        adj.get(1).add(0);
        adj.get(2).add(1);
        adj.get(5).add(2);
        adj.get(4).add(2);
        adj.get(3).add(2);

        System.out.println(adj.size());

        System.out.println(adj);
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(71);

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);
        stack2.push(7);
        stack2.push(22);



    }
}
