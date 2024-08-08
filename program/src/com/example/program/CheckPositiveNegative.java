package com.example.program;

import java.util.Scanner;

public class CheckPositiveNegative {

	public CheckPositiveNegative(int n) {
		
		if(n > 0) {
			System.out.println("Entered number is Positive");
		}
		else if(n < 0) {
			System.out.println("Entered number is Negative");
		}else {
			System.out.println("Entered number is Zero");
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Check whether a number is positive or negative");
		System.out.print("Enter Number --> ");
		int n = sc.nextInt();
		CheckPositiveNegative ps = new CheckPositiveNegative(n);
		

	}

}
