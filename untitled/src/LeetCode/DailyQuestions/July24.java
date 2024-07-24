package LeetCode.DailyQuestions;

public class July24 {
    public static void main(String[] args) {
     Sol38MsJuly24 s = new Sol38MsJuly24();
     int mapping[] = {7,9,4,1,0,3,8,6,2,5};
     int nums[] = {47799,19021,162535,454,95,51890378,404};
     nums = s.sortJumbled(mapping,nums);
     for(int i : nums){
         System.out.print(i + " ");
     }
    }
}
class Sol38MsJuly24 {
    public int[] sortJumbled(int[] mapping, int[] nums) {

        // this problem can be solved using the concept of Radix Sort;

        int max = -1 ;

        for(int x : nums)
        {
            if(x > max) max = x ;
        }

        int [] ans = nums;

        for(int place = 1 ; max/place > 0 ; place *= 10 )
        {

            ans = CountSort( ans, place , mapping);

        }

        return ans;
    }


    static int[] CountSort(int [] arr , int place, int[] mapping)
    {
        int n = arr.length;

        if( n <= 1 )return arr;

        int[] ans = new int[n];

        int[] freqArr = new int[10];

        for(int x : arr)                   // making frequency array;
        {
            if(x/place != 0 || x==0)
            { int val = (x/place) % 10 ;

                freqArr[ mapping[val] ]++;        }
            else
            {
                freqArr[ 0 ]++;
            }
        }


        for(int i = 1 ; i<10 ; i++)       // converting frequency array into prefix sum array;
        {
            freqArr[i] += freqArr[i-1];
        }

        for(int i = n - 1 ; i >= 0 ; i--)
        {
            if( arr[i]/place != 0 || arr[i]== 0)
            {
                int val = ( arr[i]/place )%10;

                ans[ freqArr[mapping[val]] - 1 ] = arr[i] ;

                freqArr[mapping[val]]--;
            }
            else
            {
                ans[ freqArr[0] - 1] = arr[i];
                freqArr[0]--;
            }
        }

        return ans;
    }


}
/*
class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int numsduplicate[] = new int[nums.length];
        int n = 0;
        for (int i : nums) {
            int rev = 0;
            while (i > -1) {
                if(i == 0){
                    rev = mapping[0];
                    break;
                }else {
                    int digit = i % 10;
                    digit = mapping[digit];
                    rev = (rev * 10) + digit;
                    i = i / 10;
                    if(i ==0){
                        break;
                    }
                }
            }
            i = 0;
            while (rev > -1) {
                if(rev == 0){
                    i = 0;
                    break;
                }else {
                    int digit = rev % 10;
                    i = (i * 10) + digit;
                    rev = rev / 10;
                    if(rev == 0){
                        break;
                    }
                }
            }
            numsduplicate[n++] = i;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (numsduplicate[i] > numsduplicate[j]) {
                    int temp_dup = numsduplicate[i];
                    int temp_ori = nums[i];
                    numsduplicate[i] = numsduplicate[j];
                    nums[i] = nums[j];
                    numsduplicate[j] = temp_dup;
                    nums[j] = temp_ori;
                }
            }
        }
        for(int i : numsduplicate){
            System.out.print(i + " ");
        }
        System.out.println();

        return nums;
    }
}
*/