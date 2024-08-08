//Java Program to Extract Digits from a Given Number

package org.example.PracticesPorgrams;

/*
 * import java.util.Scanner;
public class Extract_Digits 
{
    public static void main(String args[])
    {
        int n, m, a, i = 1, counter = 0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter any number:");
        n = s.nextInt();
        m = n;
        while(n > 0)
        {
            n = n / 10;
            counter++;
        }
        while(m > 0)
        {
            a = m % 10;
            System.out.println("Digits at position "+counter+":"+a);
            m = m / 10;
            counter--;
        }
    }
}
 */

import java.util.Scanner;

public class ExtractDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to know the position of entered number");
		int n = sc.nextInt();
		int que = n;
		int count = 0;
		while(que > 0) {
			que = que / 10;
			count++;
		}
		int[] position = new int[count];
		for(int i = count;i>0;i--) {
			position[i - 1] = n % 10;
			n = n / 10;
		}
		System.out.println("Enter the position which you want");
		int pos = sc.nextInt();
		if(pos <= count && pos > 0) {
			System.out.print(position[pos - 1]);
		}else {
			System.out.println("You entered position is not valid");
		}
		sc.close();
		
	}

}
