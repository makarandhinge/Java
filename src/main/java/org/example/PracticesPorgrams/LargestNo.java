//Java Program to Find the Largest Number Among Three Numbers

package org.example.PracticesPorgrams;

import java.util.Scanner;
public class LargestNo {

	public LargestNo(int a , int b , int c) {
		
		if(a>b && a>c) {
			System.out.print(a +" is the largest number");
		}else if(b>a && b>c){
			System.out.print(b +" is the largest number");
		}else {
			System.out.print(c +" is the largest number");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Check the largest number amoung three");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		LargestNo l = new LargestNo(a,b,c);
		
		

	}

}
