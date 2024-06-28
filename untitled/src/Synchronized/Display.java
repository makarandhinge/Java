package Synchronized;

public class Display {
    public synchronized void wish(String name){
        for(int i = 1;i<=10;i++){
            System.out.println("Happy Birthday " + name);
        }
    }
}
