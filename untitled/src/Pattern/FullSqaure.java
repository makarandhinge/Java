package Pattern;

public class FullSqaure {
    public static void main(String[] args) {
        sqaurefull();
    }

    private static void sqaurefull() {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
