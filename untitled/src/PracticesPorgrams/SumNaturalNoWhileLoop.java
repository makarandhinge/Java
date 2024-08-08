package PracticesPorgrams;

public class SumNaturalNoWhileLoop {
    public static void main(String[] args) {

        int n = 10;
        int sum = 0;
        while (n > 0) {
            sum += n;
            n--;
        }
        System.out.println(sum);
    }
}
