package San_Program.Array;

public class LargestELement {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 6, 8, 4, 2, 6, 8, 32, 46, 88, 32, 1, 346, 6, 3};
        int temp = arr[0];
        for(int i : arr){
            if(temp < i){
                temp = i;
            }
        }
        System.out.println(temp);
    }
}
