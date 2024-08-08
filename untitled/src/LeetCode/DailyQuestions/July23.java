package LeetCode.DailyQuestions;

import java.util.*;

public class July23 {

            public static void main(String[] args) {
                int nums[] = {-1, 1, -6, 4, 5, -6, 1, 4, 1}; //{2,3,1,3,2};
//                int[] nums = {4, 3, 1, 1, 2, 2, 2, 3, 4, 4, 4};
                 Sol1MsJul23 f = new Sol1MsJul23();
                int[] sortedArray = f.frequencySort(nums);
                System.out.println(Arrays.toString(sortedArray));
            }
    }

class Sol11MsJul23 {
    public static int[] frequencySort(int[] nums) {
        // Step 1: Count frequencies
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Sort by frequency and value
        List<Integer> numList = new ArrayList<>();
        for (int num : nums) {
            numList.add(num);
        }

        numList.sort((a, b) -> {
            int freqCompare = Integer.compare(frequencyMap.get(a), frequencyMap.get(b));
            if (freqCompare == 0) {
                return Integer.compare(b, a); // Descending order for values with the same frequency
            }
            return freqCompare;
        });

        // Step 3: Convert back to array
        int[] sortedArray = numList.stream().mapToInt(Integer::intValue).toArray();
        return sortedArray;
    }
}

class Sol1MsJul23{
        public int[] frequencySort(int[] nums) {
            int[] count=new int[202];
            for(int i=0;i<nums.length;i++){
                count[nums[i]+100]++;
            }
            quickSort(nums,count,0,nums.length-1);
            return nums;
        }
        void quickSort(int[] nums,int freq[],int low,int high){
            if(low<high){
                int pivot=partition(nums,freq,low,high);
                quickSort(nums,freq,low,pivot-1);
                quickSort(nums,freq,pivot+1,high);
            }
        }
        int partition(int[] nums,int freq[],int low,int high){
            int pivot=freq[nums[high]+100];
            int i=low-1;
            for(int j=low;j<high;j++){
                if(pivot > freq[nums[j]+100]){
                    i++;
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }else if(freq[nums[j]+100]==pivot){
                    if(nums[high]<=nums[j]){
                        i++;
                        int temp=nums[j];
                        nums[j]=nums[i];
                        nums[i]=temp;
                    }
                }
            }
            int temp=nums[i+1];
            nums[i+1]=nums[high];
            nums[high]=temp;
            return i+1;
        }
    }

    class Sol2MsJul23{
        public int[] frequencySort(int[] nums) {
            int count[] = new int[201];
            for (int n : nums)  count[n + 100]++;
            int k = 0;
            for (int i = nums.length - 1; i >= 0;) {
                int m = 0, ind = -1;
                for (int j = 0; j < 201; j++) {
                    if (count[j] > m) {
                        m = count[j];
                        ind = j;
                    }
                }
                for (int j = 0; j < m; j++)  nums[i--] = ind - 100;
                count[ind] = 0;
            }
            return nums;
        }
    }

class Sol3MsJul23 {
    public int[] frequencySort(int[] nums) {
        int min = -100, max = 100;
        int[] freq = new int[max-min+1];

        for(int ele : nums){
            freq[ele-min]++;
        }

        ArrayList<Integer> [] buckets = new ArrayList[nums.length + 1];

        for(int bucket=0; bucket<buckets.length;bucket++){
            buckets[bucket] = new ArrayList<>();
        }

        for(int ele = min;ele<=max; ele++){
            int count = freq[ele - min];
            if(count == 0) continue;
            buckets[count].add(ele);
        }

        int idx =0;
        for(int bucket = 1; bucket<buckets.length;bucket++){
            Collections.reverse(buckets[bucket]);
            for(int ele: buckets[bucket]){
                for(int f =0; f< bucket; f++){
                    nums[idx++] = ele;
                }
            }
        }

        return nums;
    }
}




