package org.example;

import java.util.Stack;

public class StackProblem {

    public static void main(String[] args) {

    StarSolution star = new StarSolution();
    String result = star.removeStars("leet**cod*e");
    System.out.println(result);
    }
}

// This is copied from leetcode which solved in 8ms and it is best efficient way to do it

class StarSolution{
    public String removeStars(String s){

        int len = s.length();
        byte[] result = new byte[len];
        s.getBytes(0, len, result, 0);
        int stars = 0;
        for (int i = 0; i < len; i++) {
            if (result[i] == '*') {
                stars++;
            } else {
                result[i - stars * 2] = result[i];
            }
        }
        return new String(result, 0, len - stars * 2);
    }
}

// This is solved by me which is not efficient it takes more than 200ms. This program take this much of time because
// String is immutable, and we have to do manipulation in string object so we have to create more object to save and update the string.
//It is not a right approach instead convert it into byte and do manipulations. For reference class StarSolution have the solution.

class Star {
    public String removeStars(String s) {

        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            stack.push(s.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        int count = 0;
        //leet**cod*e
        for(int i=0;i<s.length();i++){
            if(stack.peek() == '*'){
                stack.pop();
                count++;
            }else if(count != 0 && stack.peek() != '*'){
                stack.pop();
                count--;
            } else if (count == 0 && stack.peek() != '*') {
                sb.append(stack.pop());
            }
        }

        sb.reverse();
        return sb.toString();
    }
}
