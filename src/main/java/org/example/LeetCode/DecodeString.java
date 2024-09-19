package org.example.LeetCode;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]")); // Output: "aaabcbc"
        System.out.println(decodeString("3[a2[c]]"));  // Output: "accaccacc"
        System.out.println(decodeString("2[abc]3[cd]ef")); // Output: "abcabccdcdcdef"
    }

    public static String decodeString(String s) {
        Stack<Integer> counts = new Stack<>();
        Stack<StringBuilder> resultStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                // Build the number (in case of multiple digits)
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                // Push the current string and count onto their respective stacks
                counts.push(k);
                resultStack.push(currentString);
                currentString = new StringBuilder(); // Reset current string
                k = 0; // Reset the count
            } else if (ch == ']') {
                // Complete the current encoded string
                StringBuilder decodedString = resultStack.pop();
                int repeatCount = counts.pop();

                for (int i = 0; i < repeatCount; i++) {
                    decodedString.append(currentString);
                }
                currentString = decodedString; // Update current string
            } else {
                // Append the current character to the current string
                currentString.append(ch);
            }
        }

        return currentString.toString();
    }
}
