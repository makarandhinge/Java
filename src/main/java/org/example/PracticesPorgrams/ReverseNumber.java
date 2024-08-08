package org.example.PracticesPorgrams;

public class ReverseNumber {

    public static void main(String[] args) {

        int n = 2345;
        int rev = 0,rem;
        do{
            rem = n%10;
            rev = rev * 10 + rem;
            n = n/10;
        }while(n>0);

        System.out.println(rev);

    }
}
