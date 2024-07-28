package Algorithm;

public class BubbleSort {
    public static void main(String[] args) {

        int arr[] = {8,2,10,5,3,13,9};
//        int arr[] = {2,3,5,8,9,10,13};
        Solution s = new Solution();
        int sort[] = s.sorting(arr);
        for(int x : sort){
            System.out.print(x + " ");
        }
    }
}

class Solution {
    int[] sorting(int arr[]){
        int flag;
        int n = arr.length;
        for(int i=0;i<n-1;i++){
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
        return arr;
    }
}
