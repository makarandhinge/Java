package PracticesPorgrams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class DuplicateString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter a String");

        try{
            str = br.readLine();
        }catch (IOException e) {
            System.out.println("An IO error occured");
            return;
        }
        Stack<Character> stack = new Stack<>();
        int i;
        stack.push(str.charAt(0));
        System.out.println(stack.peek());
        for(i = 1;i<str.length();i++){
            if(stack.peek() == str.charAt(i)){
                stack.pop();
                continue;
            }
            stack.push(str.charAt(i));

        }
        StringBuffer obj = new StringBuffer();
        while(!stack.isEmpty()){
            obj.append(stack.pop());
        }
        System.out.println(obj.reverse().toString());
        }
    }

