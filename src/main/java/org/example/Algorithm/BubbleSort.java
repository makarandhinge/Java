package org.example.Algorithm;

public class BubbleSort {
    public static void main(String[] args) {
        int Nth = 5;
        int arr[] = {8,2,10,5,3,13,9};
//        int arr[] = {2,3,5,8,9,10,13};
        Solution s = new Solution();
//        int sort[] = s.sorting(arr,Nth);
//        for(int x : sort){
//            System.out.print(x + " ");
//        }
        System.out.println(s.sorting(arr,Nth));
    }
}

class Solution {
    int sorting(int arr[],int Nth){
        int flag;
        int n = arr.length;
        for(int i=0;i<n-(n-Nth);i++){
            flag = 0;
            for(int j=0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0)break;
        }

        return  arr[n-Nth];
    }
}
