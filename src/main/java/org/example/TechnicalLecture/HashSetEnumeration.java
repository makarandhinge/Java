package org.example.TechnicalLecture;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashSetEnumeration {

    public static void main(String[] args) {

        Hashtable<Integer,Integer> h = new Hashtable<>();
        h.put(1,4);
        h.put(2,5);
        h.put(3,6);
        h.put(4,7);
        h.put(5,4);
        h.put(6,6);


        System.out.println(h);

        Enumeration e = h.elements();
        while (e.hasMoreElements()) {
            int i = (int) e.nextElement();

            System.out.println(i);

        }


    }
}
