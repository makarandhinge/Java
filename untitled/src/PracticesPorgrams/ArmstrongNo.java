package PracticesPorgrams;

import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int que = n;
        int rem,cube,total = 0;
        while(que > 0){
            rem = que % 10;
            cube = rem * rem * rem;
            total += cube;
            que = que/10;
        }
        if(total == n){
            System.out.println("It is a Armstrong Number");
        }else{
            System.out.println("It is not a Armstrong Number");
        }
        sc.close();
    }
}
