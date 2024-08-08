package org.example.PracticesPorgrams;

public class BinaryToDecimal {
    public static void main(String[] args) {

        int n = 10000;
        int rem;
        int x = 1;
        int sum = 0;
        while(n>0){
            rem = n%10;
            if(rem == 1){
                sum += x;
            }
            x *= 2;
            n = n/10;
        }
        System.out.println(sum);
    }
}
