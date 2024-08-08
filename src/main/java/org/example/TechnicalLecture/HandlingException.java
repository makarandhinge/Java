package org.example.TechnicalLecture;

public class HandlingException {
    public static void main(String[] args) {
        m1();

    }

    private static void m1(){
        m2();
    }

    private static void m2() {
       try{
           System.out.println(10/0);
       }catch(ArithmeticException e){
           System.out.println(10/2
           );
       }
    }
}
