package org.example.PracticesPorgrams;

import java.util.Arrays;

public class MostOccure {
    public static void main(String[] args) {

        int[] arr = {2, 4, 3, 5, 6, 7, 3, 2, 7, 4, 3, 2, 6, 2, 8, 2};
        Arrays.sort(arr);

        int currentElement = arr[0];
        int currentCount = 1;
        int mostFrequentElement = arr[0];
        int maxCount = 1;

        for(int i=1;i<arr.length;i++){
            if(arr[i] == currentElement){
                currentCount++;
            }else{
                currentElement = arr[i];
                currentCount = 1;
            }

            if(currentCount > maxCount){
                maxCount = currentCount;
                mostFrequentElement = currentElement;
            }

        }
        System.out.println("Most Frequent ELement is " + mostFrequentElement);
        System.out.println("Count of Frequent Element " + maxCount);
    }
}