//Java Program to Check if Two Numbers are Equal

package com.example.program;

import java.util.Scanner;

public class EqualNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Check whether the number is equal or not");
		System.out.println("Enter 1st no --> ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd no --> ");
		int b = sc.nextInt();
		
		if(a == b) {
			System.out.println("Number is Equal");
		}
		else {
			System.out.println("Number is not Equal");
		}
		sc.close();

	}

}
