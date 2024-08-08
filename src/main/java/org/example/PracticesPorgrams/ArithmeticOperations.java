//Java Program to Perform Arithmetic Operations

package org.example.PracticesPorgrams;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Element");
        int x = sc.nextInt();
        System.out.println("Enter Second Element");
        int y = sc.nextInt();

        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for subtraction");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter 4 for division");
        int n = sc.nextInt();

        switch (n){
            case 1:
                System.out.println(x+y);
                break;
            case 2:
                System.out.println(x-y);
                break;
            case 3:
                System.out.println(x*y);
                break;
            case 4:
                System.out.println(x/y);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        sc.close();


    }
}