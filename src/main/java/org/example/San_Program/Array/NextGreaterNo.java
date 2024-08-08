package org.example.San_Program.Array;

public class NextGreaterNo {

    public static void main(String[] args) {

        int[] arr = {3, 5, 2, 1, 6, 8, 4, 2, 6, 8, 32, 46, 88, 32, 1, 346, 6,-10, 3};
        int temp = arr[0];
        for(int i=0;i<arr.length - 1;i++){
            for(int j=i+1;j<arr.length - 1;j++){
                if(arr[j] > arr[i]){
                    System.out.println(arr[i] + " ----> " +arr[j]);
                    break;
                }
            }
        }

    }
}
