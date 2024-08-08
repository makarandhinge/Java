package org.example.PracticesPorgrams;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ArithmeticOperations {
    public static void main(String []args) throws IOException {
        char a;
        int b;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        a = (char) bf.read();
        System.out.println(a);
        b = Integer.parseInt(String.valueOf(a));
        System.out.println(b);

    }

}


