package org.example.PracticesPorgrams;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check the Year");
        int n = sc.nextInt();

        if(n%4 == 0){
            System.out.println("It is Leap Year");
        }else{
            System.out.println("It is not Leap Year");
        }
        sc.close();
    }
}
