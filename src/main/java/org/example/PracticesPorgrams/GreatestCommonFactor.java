package org.example.PracticesPorgrams;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        int m = 25;
        int n = 15;
        int answer = isGCD(25, 15);
        System.out.println(answer);
    }


    static int isGCD(int m, int n) {
        while (m != n) {
            if (m > n) {
                m = m - n;
            } else {
                n = n - m;
            }
        }
        return m;
    }
}
