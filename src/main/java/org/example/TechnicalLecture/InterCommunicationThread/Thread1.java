package org.example.TechnicalLecture.InterCommunicationThread;

public class Thread1 {

    public static void main(String[] args) throws InterruptedException {
        Thread2 b = new Thread2();
        b.start();
        synchronized (b){
            System.out.println("main Thread calling wait method");
            b.wait();
            System.out.println("main thread got notification from child thread");
            System.out.println(b.total);
        }
    }
}
