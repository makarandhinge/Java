public class Test {
    static int i = 10;

    static{
        m1();
        System.out.println("First Static block");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
    }

    private  static void m1(){
        System.out.println(j);
    }

    static{
        System.out.println("Second Static Block");

    }

    static int j = 20;

    static{
        System.out.println(j);
    }

}
