public class DemoParent {
    static int i = 5;
    void Parent(){
        i = 25;
        System.out.println(i);
        System.out.println(++i);
    }

}