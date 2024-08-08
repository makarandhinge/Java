package org.example.PracticesPorgrams;

import java.util.Scanner;

public class SwapTwoNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Swap two numbers");
		
		System.out.print("Enter 1st number --> ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number --> ");
		int b = sc.nextInt();
		System.out.println("1st number = " + a + " 2nd number = " + b);
		int c;
		c = a;
		a = b;
		b = c;
		System.out.print("1st number = " + a + " 2nd number = " + b);		
	}

}
