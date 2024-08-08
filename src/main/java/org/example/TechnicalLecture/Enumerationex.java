package org.example.TechnicalLecture;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Enumerationex {
    public static void main(String[] args) {

        Vector v = new Vector();
        for(int i = 0;i<=10;i++) {
            v.add(i);
        }
        System.out.println(v);

        Enumeration e = v.elements();
        while(e.hasMoreElements()){
            int i =(int) e.nextElement();
            if(i%2 == 0){
                System.out.println(i);
            }
        }

        Iterator i = v.iterator();
        while(i.hasNext()){
            int j =(int) i.next();
            if(j%2 != 0) {
                i.remove();
            }
        }
        System.out.println(v);
    }

}
