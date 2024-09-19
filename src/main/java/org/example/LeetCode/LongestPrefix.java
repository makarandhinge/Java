package org.example.LeetCode;

public class LongestPrefix {


    public static void main(String[] args) {

        Solution solution = new Solution();
        String strs[] = {"flower","flow","flight"};
        String s = solution.longestCommonPrefix(strs);
        System.out.println(s);



    }
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Initialize the prefix with the first string
        String prefix = strs[0];

        // Iterate over the rest of the strings
        for (int i = 1; i < strs.length; i++) {
            // Compare the current prefix with each string
            while (strs[i].indexOf(prefix) != 0) {
                // Reduce the prefix length
                prefix = prefix.substring(0, prefix.length() - 1);
                // If no common prefix, return an empty string
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}