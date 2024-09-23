package org.example.Final450.Array;

import java.util.Arrays;
public class KElement {

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the element in array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Kth Element");
        int k = sc.nextInt();
        SelectionSort s = new SelectionSort();
        int result = s.kthSmallestElement(arr, k);
        if (k == -1) {
            System.out.println("Enter valid Kth element");
        } else {
            System.out.println(result);
        }*/


        int[] arr = {12, 3, 5, 7, 19};
        int k = 2; // Find the 2nd smallest element
        Quickselect q = new Quickselect();
        int result = q.findKthSmallest(arr, k);
        System.out.println("The " + k + "-th smallest element is " + result);

    }
}

class SelectionSort {

    public int kthSmallestElement(int[] arr, int k) {
        if (k > arr.length) {
            return -1;
        }

        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[k - 1];

    }

}


class Quickselect {

    public static int findKthSmallest(int[] arr, int k) {
        return quickselect(arr, 0, arr.length - 1, k - 1);
    }

    private static int quickselect(int[] arr, int low, int high, int k) {
        if (low <= high) {
            int pivotIndex = partition(arr, low, high);

            if (pivotIndex == k) {
                return arr[pivotIndex];
            } else if (pivotIndex > k) {
                return quickselect(arr, low, pivotIndex - 1, k);
            } else {
                return quickselect(arr, pivotIndex + 1, high, k);
            }
        }
        return -1; // Should never reach here if k is valid
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, high);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
