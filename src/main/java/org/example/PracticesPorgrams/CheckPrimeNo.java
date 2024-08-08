package org.example.PracticesPorgrams;

import java.util.Scanner;

public class CheckPrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int flag = 0;

        for(int i = 2; i < n;i++){
            if(n%i == 0){
                flag = 0;
                break;
            }else{
                flag = 1;
            }
        }
        if(n<1){
            flag = 0;
        }else if (n == 2) {
            flag = 1;
        }
        if(flag == 1){
            System.out.println("It is Prime Number");
        }else{
            System.out.println("It is Not Prime Number");
        }
    }
}
