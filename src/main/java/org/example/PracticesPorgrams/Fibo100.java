package org.example.PracticesPorgrams;

public class Fibo100 {

    public static void main(String[] args) {
        int x = 0,y = 0,z = 1;
        for(int i = 1;i<=100;i++){

            x = y;
            y = z;
            z=x+y;
            System.out.println(x);
        }
    }
}