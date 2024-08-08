package org.example.DS450.Array;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinElement {
    public static void main(String[] args) {

        int[] no = {2, -9, 0, 5, 12, -25, 22, 9, 8,12};
        Arrays.sort(no);
        System.out.println("Maximun Element - "+no[no.length -1]);
        System.out.println("Minimum ELement - "+no[0]);

    }
}