package org.example.NotePad;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Map;
public class NonDuplicate {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = sc.next();
        HashMap<Character,Integer> hashmap = new HashMap<>();
        for(int i=0;i<input.length();i++){
            if(hashmap.containsKey(input.charAt(i))){
                hashmap.put(input.charAt(i),(hashmap.get(input.charAt(i))) + 1);
            }else hashmap.put(input.charAt(i), 1);
        }
        Iterator<Map.Entry<Character,Integer>> iterator = hashmap.entrySet().iterator();
        int count = 0;
        while(iterator.hasNext()){
            Map.Entry<Character,Integer> entry = iterator.next();
            if(entry.getValue() == 1){
                count++;
            }
        }
        System.out.println(count);

    }
}
