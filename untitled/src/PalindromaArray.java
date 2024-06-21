import java.util.Scanner;

public class PalindromaArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int n = sc.nextInt();
        System.out.println("Enter Element in Array");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int end = n-1;
        for(int i = 0;i<n;i++){
            if(arr[i] == arr[end]){
                end = end - 1;
            }else{
                System.out.println("It is not Palindroma");
                break;
            }
//            System.out.println(end);
//            System.out.println(i);
        }


    }
}
