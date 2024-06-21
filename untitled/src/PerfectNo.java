import java.util.Scanner;

public class PerfectNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1;i<n;i++){
            if(n%i == 0){
                sum += i;
            }
        }
        if(sum == 0){
            System.out.println("It is not Perfect Number");
        }else if(sum == n){
            System.out.println("It is Perfect Number");
        }else{
            System.out.println("It is Not Perfect Number");
        }
        sc.close();
    }
}
