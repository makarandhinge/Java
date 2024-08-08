package PracticesPorgrams;

import java.sql.SQLOutput;

public class IntegerToByteFloatChar {

    public static void main(String[] args) {

        int n = 1231;
        byte b = (byte) n;
        System.out.println(b);//because of byte contain only 8 bit/1 byte the last 8 binary bits only consider

        float f = n;
        System.out.println(f);
        int m = (int) f;
        System.out.println(m);
        int x = 57;
        char c = (char) n;
        System.out.println((c));

        System.out.println(9|10);
        System.out.println(1 << 31);
    }
}
