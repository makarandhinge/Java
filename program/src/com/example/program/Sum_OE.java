//Java Program to Find the Sum of Even and Odd Numbers

package com.example.program;

import java.util.*;

public class Sum_OE {
	
	int  e = 0,o = 0;

	public Sum_OE(int[] arr) {
		for(int i = 0 ; i <= arr.length - 1 ; i++) {
		if((arr[i] % 2) == 0) {
			e = e + arr[i];
		}else {
			o = o + arr[i];
		}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array Size --> ");
		int arr_size = sc.nextInt();
		int[] arr = new int[arr_size];
		System.out.println("Enter " + arr_size + " integer values in array");
		for(int i = 0 ; i <= arr.length - 1 ; i++) {
			arr[i] = sc.nextInt();
		}
		Sum_OE oe = new Sum_OE(arr);
		System.out.println("Sum of Even number is -- " + oe.e);
		System.out.println("Sum of Odd number is -- " + oe.o);
		sc.close();
		
		
		

	}

}
