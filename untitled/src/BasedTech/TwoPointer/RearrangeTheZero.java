package BasedTech.TwoPointer;

public class RearrangeTheZero {
    static int[] arr = {1,0,2,0,3,0,4,5,0,8,2,0,0,0,2,5,7,0,4};
    static int nonZeroIndex = 0;
    static int index = 0;

    public static void main(String[] args) {

        while(index < arr.length){
            if(arr[index] != 0 && arr[nonZeroIndex] != 0){
                nonZeroIndex++;
                index++;
            }else if (arr[index] == 0) {
                index++;
            }else{
                int temp = arr[index];
                arr[index] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;
                nonZeroIndex++;
                index++;
            }

        }
        for(int i : arr) {
            System.out.print(i+" ");
        }
    }

}
