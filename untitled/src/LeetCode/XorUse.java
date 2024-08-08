package LeetCode;

import org.w3c.dom.ls.LSOutput;

public class XorUse {
    public static void main(String[] args) {


        String s = "abcd";
        String t = "abcde";
//        System.out.println(s.charAt(0));
//        System.out.println(t.length());
//        System.out.println(s.charAt(0) ^ t.charAt(0)); // Output is zero
//        System.out.println(s.charAt(4));
//        try{
//            System.out.println(s.charAt(4));
//        }catch(Exception e){
//            System.out.println(t.charAt(4));
//        }
//
        for (int i = 0; i < t.length(); i++) {
            try {
                if ((s.charAt(i) ^ t.charAt(i)) == 1) {
                    System.out.println(t.charAt(i));
                }
            }catch(Exception e){
                System.out.println(t.charAt(i));
            }

        }
    }
}

