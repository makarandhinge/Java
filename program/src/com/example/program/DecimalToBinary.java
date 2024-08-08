//Java Program to Print Binary Equivalent of an Integer using Recursion

package com.example.program;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number ");
	int n = sc.nextInt();
	
	int que,rem;
	que = n;
	while(que > 0) {
		rem = que%2;
		que = que/2;
		System.out.print(rem);
	}
	sc.close();
	
/*	 int n;
     Scanner s = new Scanner(System.in);
     System.out.print("Enter the number:");
     n = s.nextInt();
     Binary_Recursion obj = new Binary_Recursion();
     String m = obj.Binary(n);
     System.out.println("Answer:"+m);
 }
 String Binary(int x)
 {
     if(x > 0)
     {
         int a = x % 2;
         x = x / 2;
         return a + "" + Binary(x);
     }
     return "";
	*/
	
	}

}
