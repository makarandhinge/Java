//Java Program to Check Whether a Character is a Vowel, Consonant or Digit

package com.example.program;

import java.util.Scanner;

public class CheckChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element");
		char n = sc.next().charAt(0);
		
		if(n == 'a'||n == 'e'||n == 'i'||n == 'o'||n == 'u'||n == 'A'||n == 'E'||n == 'I'||n == 'O'||n == 'U') {
			System.out.println("Entered element is vowel");
		}else if(n == '1'||n == '2'||n == '3'||n == '4'||n == '5'||n == '6'||n == '7'||n == '8'||n == '9'||n == '0')
		{
			System.out.println("Entered element is digit");
		}else{
			System.out.println("Entered element is consonant");
		}
		sc.close();
	}

}

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Vowel_Consonant 
{
    public static void main(String[] args) throws Exception 
    {
        char n;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the character you want to check:");
        n = (char) bf.read();
        switch(n)
        {
            case 'a':
            System.out.println("The given character "+n+" is vowel");
            break;
 
            case 'e':
            System.out.println("The given character "+n+" is vowel");
            break;
 
            case 'i':
            System.out.println("The given character "+n+" is vowel");
            break;
 
            case 'o':
            System.out.println("The given character "+n+" is vowel");
            break;
 
            case 'u':
            System.out.println("The given character "+n+" is vowel");
            break;
 
            default:
            System.out.println("The given character "+n+" is consonant");
            break;
        }
    }
}
*/