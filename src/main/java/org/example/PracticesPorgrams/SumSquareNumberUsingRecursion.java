package org.example.PracticesPorgrams;

public class SumSquareNumberUsingRecursion {
    public static void main(String[] args) {
        SumSquareNumberUsingRecursion s = new SumSquareNumberUsingRecursion();
        int n = 10;
        System.out.println(s.sum(n));
    }

    public int sum(int n) {
        if (n > 0) {
            return n * n + sum(n - 1);
        } else {
            return 0;
        }
    }
}
