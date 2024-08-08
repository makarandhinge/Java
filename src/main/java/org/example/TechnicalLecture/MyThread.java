package org.example.TechnicalLecture;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i < 20; i++) {
            System.out.println("I am Child Thread " + i );
        }
    }
}