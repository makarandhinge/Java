package org.example.Basix50;
import java.util.*;
public class ReverseString {


    public static void main(String[] args) {
    String s = "Makarand";
    System.out.println(ReverseString.usingCharSwap(s));
    }

    public static String usingCharArray(String s){
        char[] resultArray = s.toCharArray();
        String result="";
        for(int i = resultArray.length - 1;i>=0;i--){
            result += resultArray[i];
        }
        return result;
    }

    public static String usingStringBuilder(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static String usingLoop(String s){
        int len = s.length();
        String result = "";
        while(len > 0){
            result += s.charAt(len - 1);
            len--;
        }
        return result;
    }

    public static String usingByte(String s){
        byte[] b = s.getBytes();
        byte[] result = new byte[b.length];
        for(int i=0;i<b.length;i++){
            result[i] = b[b.length - i - 1];
        }
        return new String(result);
    }

    public static String usingArrayList(String s){
        char[] c = s.toCharArray();
        List<Character> reverseS = new ArrayList<>();
        for(char e : c){
            reverseS.add(e);
        }
        Collections.reverse(reverseS);
        ListIterator li = reverseS.listIterator();
        String result="";
        while(li.hasNext()){
            result += li.next();
        }
        return result;
    }

    public static String usingStringBuffer(String s){
        StringBuffer sb = new StringBuffer(s);
        return sb.reverse().toString();
    }

    public static String usingStack(String s){
        Stack<Character> stack = new Stack<>();
        int i=0;
        while(i<s.length()) {
            stack.push(s.charAt(i));
            i++;
        }
        int k=0;
        char[] c = s.toCharArray();
        while(!stack.isEmpty()){
            c[k] = stack.pop();
            k++;
        }
        return String.copyValueOf(c);
    }

    public static String usingRecursion(String s){
        if(s == null || s.equals("")){
            return s;
        }

        char[] c = s.toCharArray();

        helper(c,0);
        i=0;
        return String.copyValueOf(c);

    }
    static int i=0;
    public static void helper(char[] c, int k){
        if(k == c.length){
            return;
        }

        helper(c,k+1);

        if(i<=k){
            char temp = c[k];
            c[k] = c[i];
            c[i++] = temp;
        }
    }

    public static String usingSubString(String s){
        if(s == null||s.equals("")){
            return s;
        }

        return s.charAt(s.length()-1)+usingSubString(s.substring(0,s.length()-1));
    }

    public static String usingCharSwap(String s){
        char[] c = s.toCharArray();
        for(int i=0,l=c.length-1;i<l;i++,l--){
            char temp = c[i];
            c[i] = c[l];
            c[l] = temp;
        }

        return String.copyValueOf(c);
    }


}
