package org.example.TechnicalLecture;

public class MyRunnableTest {

    public static void main(String[] args) {
        Runnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
        System.out.println(t.getName());
        t.setName("Makarand");
        System.out.println(t.getName());
        for(int i = 1;i<10;i++) {
            System.out.println("I am Main Thread");
        }
    }
}
