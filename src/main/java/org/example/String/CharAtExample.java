package org.example.String;

import java.util.ArrayList;

public class CharAtExample {

    public static void main(String[] args) {

//        CharAtExample6 ex6 = new CharAtExample6();
//        String str = "Java is the best language";
//        int noOfVowels = ex6.countVowel(str);
//        System.out.println(str);
//        System.out.println(noOfVowels);
//        str = "Makarand Milind Hinge";
//        noOfVowels = ex6.countVowel(str);
//        System.out.println(noOfVowels);


    }


}

/**
 * chatAt basic operation return the char value at the ith index
 * String name = Makarand Milind Hinge
 */
class CharAtExample1 {
    public void basicOperation(int i) {
        String name = "Makarand Milind Hinge";
        char ch = name.charAt(i);
        System.out.println(ch);
    }
}

/**
 * try to access index which is not present in the String then what will happen
 * String name = Makarand
 * index try to access is 8th
 */
class CharAtExample2 {
    public void CheckError() {
        String name = "Makarand";
        char ch = name.charAt(8);
        System.out.println(ch);
    }
}
/**
* Simple Example how we can access the first and last character
 * String name = Makarand Milind Hinge
* */
class CharAtExample3{
    public void AccessFirstLastCharacter(){
        String name = "Makarand Milind Hinge";
        int start = 0;
        int end = name.length() - 1;
        System.out.println("Starting Character " + name.charAt(start));
        System.out.println("Ending Character" + name.charAt(end));
    }
}
/**
 * Simple Example Accessing all the element in odd index
 * String name = Makarand Milind Hinge
 * */
class CharAtExample4 {
    public void checkOddindex(){
        String str = "Makarand Milind Hinge";
        for (int i=0; i<=str.length()-1; i++) {
            if(i%2!=0) {
                System.out.println("Char at "+i+" place "+str.charAt(i));
            }
        }
    }
}
/**
 * Simple Example to counting the frequency of the character
 * String name = Makarand Milind Hinge
 * */
class CharAtExample5 {
    public void checkFreq(){
        String str = "Makarand Milind Hinge";
        int count = 0;
        for (int i=0; i<=str.length()-1; i++) {
            if(str.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println("Frequency of t is: "+count);
    }
}

/**
 * It return the count of Vowels in the String
 */
class CharAtExample6 {
    ArrayList<Character> al;

    CharAtExample6() {
        al = new ArrayList<Character>();
        al.add('a');
        al.add('e');
        al.add('i');
        al.add('o');
        al.add('u');
        al.add('A');
        al.add('E');
        al.add('I');
        al.add('O');
        al.add('U');
    }

    private boolean isVowel(char c) {
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) == c) {
                return true;
            }
        }
        return false;
    }

    public int countVowel(String s) {
        int countVowel = 0;
        int size = s.length();
        for (int i = 0; i < size; i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                countVowel++;
            }
        }
        return countVowel;
    }
}