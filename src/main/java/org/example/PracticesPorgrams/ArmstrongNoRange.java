package org.example.PracticesPorgrams;

import java.util.Scanner;

public class ArmstrongNoRange {

        public static void main(String[] args) {

            for(int n = 1;n<=1000;n++) {
                int que = n;
                int rem, cube, total = 0;
                while (que > 0) {
                    rem = que % 10;
                    cube = rem * rem * rem;
                    total += cube;
                    que = que / 10;
                }
                if (total == n) {
                    System.out.println(n);
                }
                }
            }
        }



