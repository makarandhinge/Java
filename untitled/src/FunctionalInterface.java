@java.lang.FunctionalInterface
public interface FunctionalInterface {
    public void m1();
    public static void m2(){
        System.out.println("i am static block");
    }
    @java.lang.FunctionalInterface
    interface functionalB extends java.lang.FunctionalInterface{
//        public void m3();
    }

}
