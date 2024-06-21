import java.sql.SQLOutput;

public class StaticEx {

//    static int i = 10;
//
//    static{
//        m1();
//        System.out.println("First Static block");
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Main Method");
//    }
//
//    private  static void m1(){
//        System.out.println(j);
//    }
//
//    static{
//        System.out.println("Second Static Block");
//
//    }
//
//    static int j = 20;
//
//    static{
//        System.out.println(j);
//    }

//static int x = 100;
//static {
//    m2();
//    System.out.println("Derived first static block");
//}
//
//    public static void main(String[] args) {
//        m2();
//        System.out.println("Derived class main method");
//    }
//
//    private static void m2(){
//        System.out.println(x);
//    }
//
//    static{
//        System.out.println("Derived second static block");
//    }
//
//    static int y = 200;

    int x = 100;
    {
        m2();
        System.out.println("Derived first static block");
    }

    public static void main(String[] args) {
//        StaticEx s = new StaticEx();
        System.out.println("Derived class main method");
//        StaticEx s1 = new StaticEx();
    }

    private void m2(){
        System.out.println(y);
    }

    {
        System.out.println("Derived second static block");
    }

    int y = 200;
}

