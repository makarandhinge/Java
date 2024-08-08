public class MethodReferanceStatic {

    public static void m1(){
        for(int i = 0;i<10;i++){
            System.out.println("child Thread");
        }
    }
    public MethodReferanceStatic() {
        System.out.println("I am a constructor");
    }

    public static void main(String[] args) {
        Runnable r = MethodReferanceStatic:: new;
        Thread t = new Thread(r);
        t.start();
        for(int i =0;i<10;i++){
            System.out.println("main thread");
        }
    }
}
