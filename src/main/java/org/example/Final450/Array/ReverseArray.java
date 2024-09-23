package org.example.Final450.Array;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Array Size");
    int n = sc.nextInt();
    System.out.println("Enter the element in array");
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    Reverse r = new Reverse();
    int[] result = r.reverseInteger(arr);
    for(int i : result){
        System.out.print(i);
    }
    }
}

class Reverse{

    public int[] reverseInteger(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
            return arr;
    }

}
