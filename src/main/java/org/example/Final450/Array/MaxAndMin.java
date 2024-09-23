package org.example.Final450.Array;


import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the element in array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        MaximumMinimum m = new MaximumMinimum();
        m.printMaxMin(arr);
    }
}

class MaximumMinimum {
    public void printMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
            if (min > i) {
                min = i;
            }
        }
        System.out.println("Maximum in Array - " + max);
        System.out.println("Minimum in Array - " + min);
    }
}
