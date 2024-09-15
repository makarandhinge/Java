package org.example.Pattern;

public class Triangle {

    public static void main(String[] args) {
        int n = 5;
        halfTriangle(n);
        System.out.println();
        mirrorHalfTriangle(n);
        System.out.println();
        numberHalfDiamond(n);
    }

    private static void numberHalfDiamond(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print((2*j)-1);
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++) {
                System.out.print(2*j);
            }
            System.out.println();
        }
    }

    private static void mirrorHalfTriangle(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void halfTriangle(int n) {

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
