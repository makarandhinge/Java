import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionalInterfaceEg {

    public static void main(String[] args) {

        Function<Integer,Integer> f = i -> i*i ;
        System.out.println(f.apply(3));

        Consumer<String> c = s1 -> System.out.println(s1.length());
        c.accept("makarand");
    }
}

