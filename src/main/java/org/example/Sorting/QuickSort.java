package org.example.Sorting;

/*
* */

// Reference --> https://www.youtube.com/watch?v=COk73cpQbFQ&t=545s

//Average Case Time Complexity is O(nlogn)
//Worst Case Time Complexity is O(n2) but it rarely done it can be overcome using randomize quicksort


public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 66, 5, 4, 3, 2, 1}; // Testing Purpose
        QuickSort qs = new QuickSort();
        int[] result = qs.quickSort(arr, 0, arr.length - 1);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public int[] quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(arr, start, end);
            quickSort(arr, start, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, end);
        }
        return arr;
    }

    public int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int pivotIndex = start;

        for (int i = start; i < end; i++) {
            if (arr[i] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[pivotIndex];
                arr[pivotIndex] = temp;
                pivotIndex++;
            }
        }
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[end];
        arr[end] = temp;
        return pivotIndex;
    }

}
