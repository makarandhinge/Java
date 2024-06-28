package Synchronized;

import java.awt.*;

public class SynchronizedDemo {

    public static void main(String[] args) {
        Display d = new Display();
        Threa t1 = new Threa(d,"dhoni");
        Threa t2 = new Threa(d,"kholi");
        t1.start();
        t2.start();
    }
}
