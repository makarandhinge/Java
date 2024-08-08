package org.example.PracticesPorgrams;

public class SquareNumberUsingRecursion {
    public static void main(String[] args) {
        int n = 10; //Taken from User
        int i = 1;
        SquareNumberUsingRecursion s = new SquareNumberUsingRecursion();
        s.squareNumber(n,i);
    }

    void squareNumber(int n,int i) {
        if(i<=n){
            System.out.println(i*i);
            squareNumber(n,i=i+1);
        }
    }


    }

