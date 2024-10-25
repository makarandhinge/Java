package org.example;

import java.util.Scanner;

public class PseudoEquivalentStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        int N = sc.nextInt();
        String w1 = sc.next();
        String w2 = sc.next();

        // Frequency arrays for w1 and w2
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Count frequency of each character in w1
        for (char c : w1.toCharArray()) {
            freq1[c - 'a']++;
        }

        // Count frequency of each character in w2
        for (char c : w2.toCharArray()) {
            freq2[c - 'a']++;
        }

        // Check if the strings are pseudo-equivalent
        for (int i = 0; i < 26; i++) {
            if (Math.abs(freq1[i] - freq2[i]) > 3) {
                System.out.println("-1");
                return;
            }
        }

        // If they are pseudo-equivalent, print the lexicographically smaller string
        if (w1.compareTo(w2) < 0) {
            System.out.println(w1);
        } else {
            System.out.println(w2);
        }
    }
}