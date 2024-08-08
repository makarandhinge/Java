package org.example.PracticesPorgrams;

import java.util.Scanner;

public class PerfectSquare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How Many Buckets are there");
        int bucket = sc.nextInt();
        System.out.println("Enter how many sqaures in each bucket");
        int arr[] = new int[bucket];
        int sum = 0;
        for(int i=0;i<bucket;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
//        System.out.println(sum);
//        System.out.println(Math.sqrt(sum));
        double sqrt = Math.sqrt(sum);
        if(sqrt == (long)sqrt){
            System.out.println("Is a Perfect Square");
        }else{
            System.out.println("Is not a Perfect Sqaure");
        }

    }
}
