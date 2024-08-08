package org.example.Pattern;

public class InternalVarsitySqaure {
    public static void main(String[] args) {

        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                if(i==0||j==0||j==2||i==3){
                    System.out.print("3");
                }else{
                    System.out.print(i);
                }
            }
            System.out.println();
        }

    }
}
