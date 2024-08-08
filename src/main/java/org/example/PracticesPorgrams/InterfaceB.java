public class InterfaceB implements InterfaceA {
    @Override
    public void sum(){
        System.out.println("i am a abstract method");
    }

    public static void main(String[] args) {
        InterfaceA.multiply();
        InterfaceB b=new InterfaceB();
        b.substract();
        b.sum();
    }
    @Override
    public void substract(){
        InterfaceA.super.substract();
    }
}
