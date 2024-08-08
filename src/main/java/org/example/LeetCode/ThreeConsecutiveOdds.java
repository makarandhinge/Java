package org.example.LeetCode;

public class ThreeConsecutiveOdds {

    public static void main(String[] args) {

        int arr[] = {1,2,34,3,4,5,7,23,12};
        int index,count = 0;

        for(index=0;index<arr.length;index++){
            if((arr[index]%2) != 0){
                count++;
                if(count == 3){
                    System.out.println("true");
                    break;
                }
            }else{
                count = 0;
            }
        }
        if(count != 3){
            System.out.println("false");
        }
    }
}
