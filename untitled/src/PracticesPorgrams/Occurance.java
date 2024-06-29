package PracticesPorgrams;

import java.util.Arrays;

public class Occurance {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 1, 4, 1, 5, 2, 3, 1};

        System.out.println("Most frequent element: " + findMostFrequentElement(array));
    }

    public static int findMostFrequentElement(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        // Sort the array
        Arrays.sort(array);

        // Initialize variables to track the most frequent element
        int mostFrequentElement = array[0];
        int currentElement = array[0];
        int maxCount = 1;
        int currentCount = 1;

        // Single loop to find the most frequent element
        for (int i = 1; i < array.length; i++) {
            if (array[i] == currentElement) {
                currentCount++;
            } else {
                currentElement = array[i];
                currentCount = 1;
            }

            // Update the most frequent element if necessary
            if (currentCount > maxCount) {
                mostFrequentElement = currentElement;
                maxCount = currentCount;
            }
        }

        return mostFrequentElement;
    }
}
