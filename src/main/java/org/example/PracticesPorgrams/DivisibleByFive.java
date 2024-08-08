//Java Program to Find the Number of Integers Divisible by 5

package org.example.PracticesPorgrams;

import java.util.Scanner;

public class DivisibleByFive {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Check whether the number is divisible by 5 or not");
		 System.out.print("Enter the number --> ");
		 int x = sc.nextInt();
		 if(x % 5 == 0) {
			 System.out.println(x + " is Divisible by 5 ");
		 }else {
			 System.out.println(x + " is not Divisible by 5 ");
		 }

	}

}
