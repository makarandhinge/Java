

package org.example.PracticesPorgrams;

import java.util.Scanner;

public class FindNumberArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter "+n+" element in array");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the number you want to find");
		int f = sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(f == arr[i]) {
				System.out.println("Number Found!! array index number is " + i);
			}
		}

	}

}
