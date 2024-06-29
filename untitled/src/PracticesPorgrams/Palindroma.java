package PracticesPorgrams;

import java.util.Scanner;

public class Palindroma {

    static int x;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        x = sc.nextInt();
        if(isPalindroma(x) == true){
            System.out.println("it is Palindroma");
        }else{
            System.out.println("not a Palindroma");
        }
    }

    private static boolean isPalindroma(int x){
        if(x < 0){
            return false;
        }

        if(x >= 0 && x < 10){
            return true;
        }

        return recursive(x,0);
    }

    private static boolean recursive(int que,int reversed){
        if(que == 0){
            return true;
        }
        recursive(que / 10,reversed * 10 + que % 10);
        return reversed == x;
    }

//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the array size");
//         int n = sc.nextInt();
//         int[] arr1 = new int[n];
//
//         for(int i = 0;i < arr1.length;i++){
//             arr1[i] = sc.nextInt();
//         }
//         int i = 0;
//         int j = arr1.length - 1;
//         while(i < arr1.length){
//             if(arr1[i] == arr1[j]){
//                if(i == arr1.length - 1){
//                    System.out.println("Palindrome");
//                }
//             }else{
//                 i = arr1.length;
//                 System.out.println("not a palindrome");
//             }
//         }


//         System.out.println("Enter the Value ");
//         int n = sc.nextInt();
//         int que = n;
//         int rem;
//         int rev = 0;
//         while(que > 0){
//             rem = que % 10;
//             rev = rev * 10 + rem;
//             que = que / 10;
//         }
//
//         if(n == rev){
//             System.out.println("Palindrome");
//         }else{
//             System.out.println("Not Palindrome");
//         }


}
