package LeetCode;

public class Palindrome {

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        System.out.println(p.checker("0P"));
        System.out.println("Time complexity is O(n) and 251ms");


}

public boolean checker(String s){
    String rev = "",nrm = "";
    for(char c : s.toCharArray()){
        if(c>='A' && c<='Z' || c>='a' && c<='z' || c>='0' && c<='9') {
            rev = c + rev;
            nrm += c;
        }
    }

    System.out.println(rev.toLowerCase() == nrm.toLowerCase());
    System.out.println(nrm.toLowerCase().equals(rev.toLowerCase()));
    if(rev.toLowerCase() == nrm.toLowerCase()){
        return true;
    }else{
        return false;
    }
    }


}
/*
public class Palindrome {
    public static void main(String[] args) {
        Palindrome d = new Palindrome();
        System.out.println(d.isPalindrome("A man NAM a"));
    }
private boolean valid(char ch){
    if(ch>='a'&& ch<='z'|| ch>='A' && ch<='Z'|| ch>='0' && ch<='9'){
        return true;
    }
    return false;
}
public int tolowercase(char s){
    if(s>='a' && s<='z'||s>='0' && s<='9'){
        return s;
    }
    else{
        return (char)(s - 'A' + 'a');
    }
}

public boolean isPalindrome(String s) {
    int i=0;
    int j=s.length()-1; //j = 11
    System.out.println(!valid(s.charAt(0)));

    while(i<j){ //0<11
        if(!valid(s.charAt(i))){ //A
            i++;
        }
        else if(!valid(s.charAt(j))){
            j--;
        }
        else{
            if(tolowercase(s.charAt(i))!=tolowercase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
    }
    return  true;
}
}
 */