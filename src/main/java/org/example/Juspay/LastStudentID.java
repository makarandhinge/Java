package org.example.Juspay;

import java.util.Scanner;

public class LastStudentID {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input string
        String s = sc.next();
        sc.close();

        // Find and print the lexicographically largest substring
        System.out.print(findLargestSubstring(s));
    }

    /**
     * Finds the lexicographically largest substring in the given string.
     *
     * @param s The input string.
     * @return The lexicographically largest substring.
     */
    public static String findLargestSubstring(String s) {
        int n = s.length();
        int maxPos = 0; // Starting index of the current largest suffix

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) > s.charAt(maxPos)) {
                // Found a character greater than the current maximum
                maxPos = i;
            } else if (s.charAt(i) == s.charAt(maxPos)) {
                // If characters are equal, compare the substrings character by character
                int j = 0;
                while (i + j < n && maxPos + j < n) {
                    if (s.charAt(i + j) > s.charAt(maxPos + j)) {
                        maxPos = i;
                        break;
                    } else if (s.charAt(i + j) < s.charAt(maxPos + j)) {
                        break;
                    }
                    j++;
                }
            }
            // If characters are not greater or equal, do nothing
        }

        // Extract the substring from the identified position to the end
        return s.substring(maxPos);
    }
}
