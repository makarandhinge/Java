import java.io.*;


public class replace {
    public static void main(String[] args) {

//        String s = "makarand milind hinge";
//        String m = s.replace(" ", "m");
//        System.out.println(m);
        StringBuffer s = new StringBuffer("makarand");
        System.out.println(s.capacity());
        System.out.println(s.append("abcdefghijklmnop"));
        System.out.println(s.capacity());
        System.out.println(s.append("q"));
        System.out.println(s.capacity());




    }
}
