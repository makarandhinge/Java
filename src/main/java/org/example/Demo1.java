package org.example;


public class Demo1 {
    public static void main(String[] args) {
        System.out.println(reverse(95));
    }

    static int reverse(int n){
        int reverseNumber = 0;
        while(n>0){
            reverseNumber = reverseNumber * 10 + n % 10;
            n = n/10;
        }
        return reverseNumber;
    }
}
