package PracticesPorgrams;

public class BinaryToDecimalUsingRecursion {
    public static void main(String[] args) {
        int n = 11111;
        int x = 1;
        int rem = n%10;
        BinaryToDecimalUsingRecursion b = new BinaryToDecimalUsingRecursion();
        System.out.println(b.converter(n,x,rem));

    }

    private int converter(int n, int x,int rem) {
        if(n == 0){
            return 0;
        }
        return (x*rem) + converter(n=n/10,x=x*2,rem=n%10);
    }

}
