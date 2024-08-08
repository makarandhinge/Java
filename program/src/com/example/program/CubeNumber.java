//Java Program to Find the Sum of n Cube Numbers

package com.example.program;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class CubeNumber {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number ");
		int n = Integer.parseInt(bf.readLine());
		if(n<=0) {
			System.out.println("Number not be negative");
		}else {
			System.out.println(((n*(n+1)/2)*(n*(n+1)/2)));
		}

	}

}
/*import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class SumOfNCubeNumbers {
     // Function to read n and display the sum
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("Enter the value of n");
        try{
            n = Integer.parseInt(br.readLine());
        }catch (Exception e){
            System.out.println("An error occurred");
            return;
        }
        if(n<0){
            System.out.println("n cannot take negative values");
            return;
        }
        double sum = Math.pow(n*(n+1)/2,2);
        System.out.println("The sum of first " + n + " cube numbers is " + sum);
    }
}
 * */
