package org.example.TechnicalLecture.Java_8;

@FunctionalInterface
public interface InterfaceB {

    public void m1();
    public static void m2(){
        System.out.println("I am static method");
    }
    @FunctionalInterface
    interface fun extends InterfaceB{
//        public void m3();
    }


}
