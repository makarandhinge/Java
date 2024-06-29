package PracticesPorgrams;

public class Fibo {

    public static void main(String[] args) {
        int i = 10,x = 0,y = 1,z = 0,j=1;
        System.out.println(x);
        System.out.println(y);
        while( j <= i){
            System.out.println(z=x+y);
            x = y;
            y = z;
            j++;
        }
    }
}
