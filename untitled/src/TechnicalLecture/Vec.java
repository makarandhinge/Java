package TechnicalLecture;

import java.util.Vector;
import java.util.Stack;

public class Vec{
    public static void main(String[] args) {
        Vector al = new Vector(5,10);
        Stack s = new Stack();
        s.push("A");
        s.push("B");
        s.push("C");

        System.out.println(s.search("C"));
        System.out.println(s);

    }
}
