package org.example.LeetCode;

/*
Reverse Vowels of a String
Input: "hello"
Output: "holle"
 */

public class ReverseVowels {
    public static void main(String[] args) {

        ReverseVowels r = new ReverseVowels();
        System.out.println(r.reverseVowels("leetcode"));

    }
    public String reverseVowels(String s) {
        return "";
    }

    private boolean vowelChecker(char n){

        if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u'||n=='A'||n=='E'||n=='I'||n=='O'||n=='U'){
            return true;
        }
        return false;
    }
}
