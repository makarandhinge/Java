//Java Program to Find the Sum of n Square Numbers

package org.example.PracticesPorgrams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareNumber {
public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number ");
		int n = Integer.parseInt(bf.readLine());
		if(n<=0) {
			System.out.println("Number not be negative");
		}else {
			System.out.println(((n*(n+1)*(2*n+1))/6));
		}

	}
}
