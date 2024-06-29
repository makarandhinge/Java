package San_Program.Array;

public class SecondLargestAndSmallestElement {
    public static void main(String[] args) {

        int[] arr = {3, 5, 2, 1, 6, 8, 4, 2, 6, 8, 32, 46, 88, 32, 1, 346, 6,-10, 3};
        int temp = arr[0];
        int temp2 = 0;
        int smallest = arr[0];
        for(int i : arr){
            if(temp < i){
                temp2 = temp;
                temp = i;
            }
            if(smallest > i ){
                smallest = i;
            }
        }
        System.out.println(temp2);
        System.out.println(smallest);
    }
}
