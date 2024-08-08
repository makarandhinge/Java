package org.example.LeetCode;

public class JavaString {
    public static void main(String[] args) {
        A obj = new B();
        obj.display();

    }
}

class A{
    void display() {
        System.out.println("A");
    }
}

class B extends A{
    void display(){
        System.out.println("B");
    }
}
