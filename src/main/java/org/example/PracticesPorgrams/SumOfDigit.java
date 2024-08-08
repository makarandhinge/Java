//Java Program to Find Sum of Digits of a Number

package org.example.PracticesPorgrams;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a number to check the sum of digit -- ");
		int a = sc.nextInt();
//		System.out.println(a/10); for quotient
//		System.out.println(a%10); for remainder
		int que = a;
		int sum = 0;
		while(que != 0) {
			sum+=que%10;
			que = que / 10;
		}
		System.out.println(sum);
	}

}
