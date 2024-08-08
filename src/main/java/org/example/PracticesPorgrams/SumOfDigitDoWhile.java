package org.example.PracticesPorgrams;

public class SumOfDigitDoWhile {
    public static void main(String[] args) {

        int n = 9999,sum = 0;
        do{
            sum += n%10;
            n = n/10;
        }while(n>0);
        System.out.println(sum);
    }
}
