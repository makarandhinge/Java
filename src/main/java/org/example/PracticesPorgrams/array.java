import java.util.Arrays;

public class array {

    public static void main(String[] args) {

        int[] arr = {2, -9, 0, 5, 12, -25, 22, 9, 8,12};
        int n = arr.length;
        Arrays.sort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        int [] subarr1 = new int[n/2];
        int [] subarr2 = new int[n/2];

        for(int i=0;i<n;i++){
            if(i < n/2){
                subarr1[i] = arr[i];
            }
            if(i>=n/2){
                subarr2[i - 5] = arr[i];
            }
        }
        for(int i : subarr1){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i : subarr2){
            System.out.print(i + " ");
        }
    }
}
