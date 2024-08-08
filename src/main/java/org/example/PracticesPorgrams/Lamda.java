public class Lamda {
    public static void main(String[] args) {
        FunctionalInterfaceEX i = (int a,int b) -> {

            System.out.println(a+b);
        };
        i.m1(10,20);
    }

}

