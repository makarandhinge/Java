import java.util.function.Predicate;

public class Predefinedfunction {
    public static void main(String[] args) {
        String[] s = {"sajjad ", "shubh", "suki"};
        Predicate<String> p = s1 -> s1.length() > 5;
        for (String s2 : s) {
            if (p.test(s2)) {
                System.out.println(s2);
            }
        }
    }
}
