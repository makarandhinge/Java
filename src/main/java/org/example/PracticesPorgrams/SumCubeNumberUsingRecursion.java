package org.example.PracticesPorgrams;

public class SumCubeNumberUsingRecursion {
    public static void main(String[] args) {
        SumCubeNumberUsingRecursion s = new SumCubeNumberUsingRecursion();
        int n = 10;
        System.out.println(s.sum(n));
    }

    public int sum(int n) {
        if (n > 0) {
            return n * n * n + sum(n - 1);
        } else {
            return 0;
        }
    }
}
