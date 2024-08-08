package org.example.PracticesPorgrams;

import java.util.Scanner;

public class StringConcate {
    public static void main(String[] args) {
        String a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string ");
        a = sc.nextLine();
        System.out.println("Enter second string");
        b = sc.nextLine();
        StringConcate s = new StringConcate();
        c = s.concat(a,b);
        System.out.println(c);
    }

    String concat(String x,String y){
        String z;
        z = x + " " + y;
        return z;
    }
}
