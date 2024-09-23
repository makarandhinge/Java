package org.example.LeetCode.DailyQuestions;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
// Leetcode - 386
public class September21 {
    public static void main(String[] args){
//        LexicographicalNumbers ln = new LexicographicalNumbers();
//        ln.lexicalOrder(13);
//        System.out.println(ln.lexicalOrder(13));

    }
}

class LexicographicalNumbers{
public List<Integer> lexicalOrder(int n) {
    Integer[] arr = new Integer[n];
    for(int i=0;i<n;i++){
        arr[i] = i+1;
    }
    Arrays.sort(arr,(a,b) -> a.toString().compareTo(b.toString()));
    return Arrays.asList(arr);
}


    public List<Integer> output = new ArrayList<>();

    public List<Integer> lexicalOrder2(int n) {
        recursiveTrie(0, n);
        return output;
    }

    public void recursiveTrie(int node, int n) {
        for (int i = node; i <= Math.min(node + 9, n); i++) {
            if (i == 0) continue;
            output.add(i);
            if (10 * i <= n) recursiveTrie(10 * i, n);
        }
    }
}
