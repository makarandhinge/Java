import java.util.Scanner;

public class CheckPrimeNoR {
    boolean flag;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int i = n - 1;
        CheckPrimeNoR c = new CheckPrimeNoR();
        if(c.isPrime(n,i)){
            System.out.println("It is Prime Number");
        }else{
            System.out.println("It is not Prime Number");
        }
    }

    boolean isPrime(int n , int k) {
            if(n <= 1){
                return false;
            }else if(n == 2){
                return true;
            }
            if(n % k == 0){
                return false;
            }else if (k == 1){
                    return true;
            }
            isPrime(n , k - 1);
            return true;

    }
}
