package org.example.Sorting;

public class SelectionSort {
    public static void main(String[] args){

        int[] arr = {10, 9, 8, 7, 66, 5, 4, 3, 2, 1}; // Testing Purpose
        SelectionSort ss = new SelectionSort();
        ss.selectionSort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public int[] selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
