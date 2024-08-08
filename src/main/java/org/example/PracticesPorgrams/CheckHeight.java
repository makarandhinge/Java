//Java Program to Accept the Height of a Person and Categorize as Taller, Dwarf & Average

package org.example.PracticesPorgrams;

import java.util.Scanner;
public class CheckHeight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your height");
		int n = sc.nextInt();
		
		if(n>=180) {
			System.out.println("Taller");
		}else if(n>=155) {
			System.out.println("Average");
		}else{
			System.out.println("Dwarf");
		}
		sc.close();
	}

}
