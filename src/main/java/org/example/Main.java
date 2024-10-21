package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    // Driver code
    public static void main(String[] args) {
    char c = '2';
    String s = "07:05:45PM";
    int a = 5;
    if(s.contains("PM")){
       String result = s.replace("PM","");
       String remove = result.substring(0,2);
       String result2 = result.replace(remove,"");

       int result3 = Integer.parseInt(remove) + 12;
       String result4 = result3 + result2;
       System.out.println(result4);
    }
    }


}