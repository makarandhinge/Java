
//Java Program to Check Whether a Given Number is Even or Odd

package org.example.PracticesPorgrams;
import java.util.*;

public class EvenAndOdd {

	

	public static String EvenAndOdd(int n) {
		
		if((n%2) == 0) {
			return "Entered number is Even";
		}
		else {
			return "Entered number is Odd";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Check wheather the number is Even or Odd --> ");
		int n = sc.nextInt();
		EvenAndOdd oe = new EvenAndOdd();
		
		System.out.println(oe.EvenAndOdd(n));
		

	}

}
