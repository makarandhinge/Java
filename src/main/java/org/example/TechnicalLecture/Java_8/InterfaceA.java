package org.example.TechnicalLecture.Java_8;

public interface InterfaceA {

    public void sum();
    default void subtract(){
        System.out.println("I am Default method");
    }
    public static void multiple(){
        System.out.println("I am static method");
    }


}
