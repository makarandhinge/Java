package org.example.Sorting;


/*
* Merge sort is a sorting technique based on divide and conquer technique.
* Merge Sort first divide the array into equal halves and then combine them in a sorted manner.
*Worst Case Time Complexity is O(nlogn).
*
* Disadvantage -->
* It required extra space N.
* Merge Sort is less efficient than other sort.
*
* Reference -- https://www.youtube.com/watch?v=TzeBrDU-JaY
* */


public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}; // Testing Purpose
        MergeSort ms = new MergeSort();
        ms.mergeSort(arr);
        for (int i : arr) {
            System.out.print(i);
        }
    }

    public int[] mergeSort(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return arr;
        }
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = 0; i < (n - mid); i++) {
            right[i] = arr[i + mid];
        }
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
        return arr;
    }

    public int[] merge(int[] arr, int[] l, int[] r) {
        int nl = l.length;
        int nr = r.length;
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < nl && j < nr) {
            if (l[i] < r[j]) {
                arr[k] = l[i];
                i++;
            } else {
                arr[k] = r[j];
                j++;
            }
            k++;
        }
        while (i < nl) {
            arr[k] = l[i];
            i++;
            k++;
        }
        while (j < nr) {
            arr[k] = r[j];
            j++;
            k++;
        }
        return arr;
    }

}
