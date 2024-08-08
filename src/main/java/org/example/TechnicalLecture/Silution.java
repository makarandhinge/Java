package org.example.TechnicalLecture;

class Silution {


    public int reverse(int x) {

        long que = x, rem, rev = 0;
        while (que != 0) {
            rem = que % 10;
            que = que / 10;
            rev = rev * 10 + rem;
        }
        if (rev <= 2147483647) {
            return (int) rev;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        Silution s = new Silution();
        System.out.println(s.reverse(1534236469));

    }
}