package PracticesPorgrams;

public class ReverseNumberUsingRecursion {

    public static void main(String[] args) {
        int n = 1234,rev = 0;
        ReverseNumberUsingRecursion r = new ReverseNumberUsingRecursion();
        System.out.println(r.reverse(rev,n));
    }

    int reverse(int rev,int n){
        if(n == 0){
            return rev;
        }
        return reverse(rev * 10 + (n%10),n/10);
    }
}
