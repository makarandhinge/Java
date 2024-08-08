package org.example.TechnicalLecture.Synchronized;

public class Display {
    public void wish(String name) {
        synchronized (Display.class) {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Happy Birthday " + name);

            }
        }
    }
}
