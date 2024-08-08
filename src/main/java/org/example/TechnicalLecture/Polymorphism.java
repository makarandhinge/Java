package org.example.TechnicalLecture;/*
Method Overloading -- Method having same name Different parameter.
In Method Overloading method resolution is taken care by compiler.
This is also know as Static polymorphism or early binding


 */

public class Polymorphism {


    public static void main(String... args) {
        Polymorphism p = new Polymorphism();
        p.m1(10);

    }

    public void m1(){
        System.out.println("1");
    }

    public void m1(int ...x){
        System.out.println("2");
    }

    public void m1(int x){
        System.out.println("3 ");
    }

    public void m1(long x){
        System.out.println("4");
    }
}
