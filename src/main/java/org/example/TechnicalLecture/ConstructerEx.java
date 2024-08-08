package org.example.TechnicalLecture;

import java.util.ArrayList;

public class ConstructerEx {


    public static void main(String[] args) {
//        Collection al = new ArrayList();
//        al.add("A");
//        al.add("A");
//        al.add("B");
//        al.add("2");
//        al.remove("A");
//        System.out.println(al);
        ArrayList<Integer> al = new ArrayList();
        ArrayList<Integer> a = new ArrayList();
        al.add(5);
        al.add(5);
        al.add(75);
        al.add(2);
        al.add(34);
        int count = 0;
        for(int i : al){
            if(i%5 == 0){
                count++;
                a.add(i);
            }
        }
        System.out.println(count);
        System.out.println(a);







    }
}
