//Java Program to Check Whether a Given Alphabets are Uppercase or Lowercase or Digits

package com.example.program;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AlphabetCheck {

	public static void main(String[] args) throws IOException{
	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the element");
		char c =(char)bf.read();
		if(c>='A' && c <='Z') {
			System.out.println("Uppercase");
		}else if(c>='a' && c <='z') {
			System.out.println("Lowecase");
		}else{
			System.out.println("Digit");
		}
	}

}
/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Alphabet_Check 
{
    public static void main(String args[]) throws IOException
    {
        char m;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any alphabet:");
        m = (char) bf.read();
        if(m >= 97 && m <= 123)
        {
            System.out.println("Lower Case");
        }
        else if(m >= 65 && m <= 96)
        {
            System.out.println("Upper Case");
        }
        else if(m >= 48 && m <= 57)
        {
            System.out.println("Digit");
        }
    }
}*/