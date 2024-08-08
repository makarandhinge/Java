//Java Program to Find Sum of Digits of a Number using Recursion
package org.example.PracticesPorgrams;

/*
		import java.util.Scanner;
public class Digit_Sum 
{
    int sum = 0;
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        n = s.nextInt();
        Digit_Sum obj = new Digit_Sum();
        int a = obj.add(n);
        System.out.println("Sum:"+a);
    }
    int add(int n)
    {
        sum = n % 10;
        if(n == 0)
        {
            return 0;
        }
        else
        {
             return sum + add(n / 10);
        }
 
    }
}
	*/


import java.util.Scanner;

public class SumOfDigitRecursion {
	
	static int sum = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check the Sum of Digit using Recursion");
		int n = sc.nextInt();
		int result = sumOfDigit(n);
		System.out.println(result);

	}
	
	public static int sumOfDigit(int que) {
		if(que > 0 ) {
			sum = sum + (que % 10);
			sumOfDigit(que / 10);
			return sum;
		}else {
			return 0;
		}
	}

}
