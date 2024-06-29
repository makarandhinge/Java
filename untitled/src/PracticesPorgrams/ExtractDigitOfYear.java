package PracticesPorgrams;

import java.util.Scanner;

public class ExtractDigitOfYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year");
        int n = sc.nextInt();
        int i = 1;
        int rev = 0;
        if(n >= 1000 && n <= 9999){
            while(i<=2){
                rev = rev * 10 + (n%10);
                n = n/10;
                i++;
            }
            while(rev>0){
                System.out.print(rev%10);
                rev = rev/10;
            }
        }
    }
}
