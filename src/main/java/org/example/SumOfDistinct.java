package org.example;

import java.util.HashMap;

public class SumOfDistinct {

    public static void main(String[] args) {

        int arr[] = {10,20,10,30,20,40};
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int sum = 0;
        for(int i=0;i< arr.length;i++){
            if(hashMap.containsKey(arr[i])){
                System.out.println(arr[i] + " - " + hashMap.get(arr[i]));
                hashMap.put(arr[i],hashMap.get(arr[i]) + 1);
            }else{
                hashMap.put(arr[i],1);
            }
        }
        for(int key : hashMap.keySet()){
            if(hashMap.get(key) == 1){
                sum += key;
                System.out.println("key - " + key);
            }
        }

        System.out.println(sum);

    }
}
