package PracticesPorgrams;

import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int que = sc.nextInt();
        int rev = 0, rem;
        while(que > 0){
            rem = que%10;
            rev = rev * 10 + rem;
            que = que/10;
        }
        System.out.println(rev);
    }
}
