import Demo.Demo;

public class DemoChild extends DemoParent{
    static int i;
    void Child(){
        i = 10;
        System.out.println(super.i);
        System.out.println(++i);
    }
    public static void main(String[] args) {

        DemoChild c = new DemoChild();
        c.Child();

    }
}
