package org.example.Sorting;

public class BubbleSort {
    public static void main(String[] args){

        int[] arr = {10, 9, 8, 7, 66, 5, 4, 3, 2, 1}; // Testing Purpose
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public int[] bubbleSort(int[] arr){
        int n = arr.length - 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
