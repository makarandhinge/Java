package org.example.Searching;

public class BinarySearch {

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14}; // Testing Purpose
        int value = 14;
        int n = arr.length;
        BinarySearch bs = new BinarySearch();
        int result = bs.binarySearch(arr, value, n);
        System.out.println(result);

    }
    /**
     * Performs binary search on a sorted array to find a specified value.
     *
     * The array must be sorted in ascending order for the search to work properly.
     *
     * @param arr   The sorted array in which the search is performed.
     * @param value The value to search for within the array.
     * @return      The index of the value if it is found in the array;
     *              -1 if the value is not found.
     *
     * @author Makarand Milind Hinge
     */
    public int binarySearch(int[] arr,int value,int n){
        int start = 0;
        int end = n - 1;
        while(start <= n){
            int mid = (start + end) / 2;
            if(value == arr[mid]){
                return mid;
            }else if(value > arr[mid]){
                start = mid + 1;
            }else if(value < arr[mid]){
                end = mid - 1;
            }

        }
        return -1;
    }


}
