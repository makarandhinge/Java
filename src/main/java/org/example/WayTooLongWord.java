package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class WayTooLongWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        System.out.println(s.charAt(0) + "" +(n-2)+ "" + s.charAt(n-1));



    }
}
