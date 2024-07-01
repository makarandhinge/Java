public interface InterfaceA {
    public void sum();
    default void substract(){System.out.println("i am a default method");}
    public static void multiply(){
        System.out.println("i am a static metohd");
    }
}
