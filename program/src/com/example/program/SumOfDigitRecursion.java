//Java Program to Find Sum of Digits of a Number using Recursion

package com.example.program;

import java.util.Scanner;

public class SumOfDigitRecursion {
	
	static int sum = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check the Sum of Digit using Recursion");
		int n = sc.nextInt();
		int result = sumOfDigit(n);
		System.out.println(result);

	}
	
	public static int sumOfDigit(int que) {
		if(que > 0 ) {
			sum = sum + (que % 10);
			sumOfDigit(que / 10);
			return sum;
		}else {
			return 0;
		}
	}

}
