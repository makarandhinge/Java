import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Immutable {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(20);
        al.add(30);
        al.add(40);
        List all = List.of(al);
        List alll = List.of(10,20,30,40,50);
        Set s = Set.of(20,10,40);

    }
}
