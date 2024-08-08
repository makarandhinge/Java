package PracticesPorgrams;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PatternProblem_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a element number ");
        int n = sc.nextInt();
        int count = 1;
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= n;j++){
                if(count < 10){
                    System.out.print("00");
                }
                if(count > 9 && count < 100){
                    System.out.print("0");
                }
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
