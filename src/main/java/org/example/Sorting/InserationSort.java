package org.example.Sorting;

public class InserationSort {
    public static void main(String[] args){
        int[] arr = {10, 9, 8, 7, 66, 5, 4, 3, 2, 1}; // Testing Purpose
        InserationSort is = new InserationSort();
        is.inserationSort(arr,arr.length);
        for(int i : arr){
            System.out.print(i + " ");
        }

    }

    public int[] inserationSort(int[] arr,int n){
            for(int i=1;i<n;i++){
                int value = arr[i];
                int hole = i;
                while(hole>0 && arr[hole-1]>value){
                    arr[hole] = arr[hole-1];
                    hole = hole-1;
                }
                arr[hole] = value;
            }
            return arr;
    }
}
