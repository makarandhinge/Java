package org.example.PracticesPorgrams;

import java.sql.SQLOutput;

public class PrintNaturalNumber {
    public static void main(String[] args) {
        int n = 50,i = 1;
        PrintNaturalNumber p = new PrintNaturalNumber();
        p.naturalNumber(n,i);
    }

    private void naturalNumber(int n,int i) {
        if(i<=n){
            System.out.println(i);
            naturalNumber(n,i = i + 1);

        }
    }


}
