package DS450.Array;

import java.util.Arrays;
import java.util.Scanner;

public class KthMinElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Kth Element");
        int n = sc.nextInt();
        int[] no = {2, -9, 0, 5, 12, -25, 22, 9, 8,12};
        for(int i : no){
            System.out.print(i + " ");
        }
        Arrays.sort(no);
        System.out.println();
        for(int i : no){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(no[n - 1]);
    }
}
