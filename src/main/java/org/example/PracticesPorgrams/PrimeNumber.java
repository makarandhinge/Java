package org.example.PracticesPorgrams;

public class PrimeNumber {

    public static void main(String[] args) {

        int n = 2;
        if(isPrime(n) == true){
            System.out.println(n + " is Prime Number");
        }else{
            System.out.println(n +" is not Prime Number");
        }
    }

    static boolean isPrime(int n){
        for(int i=2;i<n/2;i++){
            if(n%i == 0){
                return false;
            }

        }
        return true;
    }
}
