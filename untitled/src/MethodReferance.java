public class MethodReferance {
    public void m1(){
        for(int i = 0;i<10;i++){
            System.out.println("child Thread");
        }
    }


    public static void main(String[] args) {
        MethodReferance methodReferance = new MethodReferance();
        Runnable r = methodReferance:: m1;
        Thread t = new Thread(r);
        t.start();
        for(int i =0;i<10;i++){
            System.out.println("main thread");
        }
    }
}
