package org.example.Searching;

public class LinearSearch {
    public static void main(String[] args){

        int[] arr = {10, 9, 8, 7, 66, 5, 4, 3, 2, 1}; // Testing Purpose
        int value = 5;
        LinearSearch ls = new LinearSearch();
        int result = ls.linearSearch(arr, value);
        System.out.println(result);
    }


    /**
     * Searches for a specific value in the given array using the linear search algorithm.
     *
     * @param arr The array of integers to search through.
     * @param value The value to search for within the array.
     * @return The index of the value if found, otherwise returns -1 if the value is not present.
     * @author Makarand Milind Hinge
     * <br>
     * <p>Example usage:</p>
     *   <pre>
     *       {@code
     *       LinearSearch ls = new LinearSearch();
     *       int[] arr = {1, 2, 3, 4, 5};
     *       int index = ls.linearSearch(arr, 3);
     *       }
     *   </pre>
     */
    public int linearSearch(int[] arr, int value) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}

