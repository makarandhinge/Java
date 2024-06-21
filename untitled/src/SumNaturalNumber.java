public class SumNaturalNumber {

    public static void main(String[] args) {

        SumNaturalNumber s = new SumNaturalNumber();
        int n = 100;
        System.out.println(s.sum(n));
    }
    public int sum(int n) {
        if(n>0){
            return n + sum(n-1);
        }else{
            return 0;
        }
    }


}
