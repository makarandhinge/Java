package PracticesPorgrams;

import java.util.Scanner;

public class CheckNumberOfDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Days");
        int n = sc.nextInt();
        int year = 0,week,day;
        int rem = 0;

        if(n>365){
            year = n/365;
            rem = n%365;
        }
        week = rem/7;
        day = rem%7;

        System.out.println("Year - " +year +" "+"Week - "+ week +" "+"Day - " + day);


    }
}
