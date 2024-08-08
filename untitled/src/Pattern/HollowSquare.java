package Pattern;

public class HollowSquare {

    public static void main(String[] args) {

    int row = 5,coloum = 5;
    sqaureHollow(row,coloum);
    }

    private static void sqaureHollow(int row, int coloum) {

        for(int i=1;i<=row;i++){
            for(int j=1;j<=coloum;j++){
                if(i==1||j==1||i==row||j==coloum){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


}
