package org.example.TechnicalLecture.Java_8;

public class InterfaceEx implements InterfaceA {

    public void sum(){
        System.out.println("I am abstract method");
    }

    public static void main(String[] args) {
        multiple();
        InterfaceEx d = new InterfaceEx();
        d.subtract();
    }

    public void substract(){
        InterfaceA.super.subtract();
    }
}
