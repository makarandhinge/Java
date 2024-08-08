package org.example.PracticesPorgrams;

public class BitManipulation1 {

    public static void main(String[] args) {

        int a = 5,b = 6; // a = 0101, b = 0110
        int c = a | b; // c = 0111 --> 7
        int d = a & b; // d = 0100 --> 4
        System.out.println(c + " " +d);
    }
}
