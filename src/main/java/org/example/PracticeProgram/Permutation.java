package org.example.PracticeProgram;

public class Permutation {

    public static void printPermutations(String str) {
        permute("", str);
    }

    private static void permute(String prefix, String remaining) {
        int n = remaining.length();

        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permute(prefix + remaining.charAt(i),
                        remaining.substring(0, i) + remaining.substring(i + 1));
            }
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printPermutations(str);
    }
}
