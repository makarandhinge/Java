package org.example.PracticesPorgrams;

import java.util.Scanner;

class RangePrime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting point");
        int start = sc.nextInt();
        System.out.println("Enter ending point");
        int end = sc.nextInt();
        int i,j,flag = 0;

        for(i = start;i <= end; i++){
            for(j=2;j<i;j++){
                if(i%j == 0){
                    flag = 0;
                    break;
                }else{
                    flag = 1;
                }

            }
            if(flag == 1){
                System.out.println(i);
            }
        }
    }
}