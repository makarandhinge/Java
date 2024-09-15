package org.example;

import java.util.ArrayList;
import java.util.List;

public class Candies {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {2,3,5,1,3};
        int extra = 3;
        List<Boolean> b = s.kidsWithCandies(arr,extra);
        System.out.println(b);

    }

}
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = 0;
        for(int i : candies){
            if(i>max){
                max = i;
            }
        }
        List<Boolean> b = new ArrayList<>();
        for(int i : candies){
            if(i+extraCandies >= max){
                b.add(true);
            }else{
                b.add(false);
            }
        }

        return b;
    }
}