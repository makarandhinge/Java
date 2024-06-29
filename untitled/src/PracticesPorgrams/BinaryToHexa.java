package PracticesPorgrams;

import java.util.Scanner;

public class BinaryToHexa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary number");
        long n = sc.nextLong();
        long rem = 0;
        int i = 1,x =1;
        int sum = 0;
        while(n>0){
            rem = n%10;
            if(rem == 1){
                sum += x;
            }

            x *= 2;
            n = n/10;
            i++;
            if(i == 4){
                if(sum>9) {
                    switch(sum) {
                        case 10:
                            System.out.print("A");
                            break;
                        case 11:
                            System.out.print("B");
                            break;
                        case 12:
                            System.out.print("C");
                            break;
                        case 13:
                            System.out.print("D");
                            break;
                        case 14:
                            System.out.print("E");
                            break;
                        case 15:
                            System.out.print("F");
                            break;
                        default:
                            break;
                    }
                }
                System.out.print(sum);
                sum = 0;
                i = 1;
                x = 1;
            }
        }
        System.out.println(sum);


    }
}
