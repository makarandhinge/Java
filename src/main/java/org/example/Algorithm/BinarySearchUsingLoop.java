package org.example.Algorithm;

public class BinarySearchUsingLoop {
    public static void main(String[] args) {
        BinarySearchUsingLoop bs = new BinarySearchUsingLoop();

        int arr[] = {2,4,6,8,10,12,14,16,18,20};
        int n = arr.length;
        int x = 18;
        int result = bs.binarySearch(arr,0,n-1,x);
        if(result == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found");
            System.out.println("Index number is "+result);
        }
    }

    private int binarySearch(int[] arr, int l, int r, int x) {

        while(l <= r) {
            int mid = (l+r)/2;
            if(arr[mid] == x){
                return mid;
            }
            else if(arr[mid] > x){
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return -1;
    }


}
