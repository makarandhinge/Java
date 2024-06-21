public class Factorail {

    public static void main(String[] args) {
        Factorail f = new Factorail();
        System.out.println( f.fact(3));

    }

    int fact(int n){

        if(n == 1){
            return 1;
        }
        return n * fact(n - 1);
    }
}
