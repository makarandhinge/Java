package org.example;

import java.util.Scanner;

public class AplusBAgain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int sum = 0;
            int count = 0;
            while (n > 0) {
                sum += n % 10;
                n = n / 10;
                count++;
            }
            if (count > 1) {
                System.out.println(sum);
            } else {

            }
        }
    }
}


