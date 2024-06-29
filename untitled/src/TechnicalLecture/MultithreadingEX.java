package TechnicalLecture;

public class MultithreadingEX {

    public static void main(String[] args) throws InterruptedException {

        MyThread t = new MyThread();
        t.start();
        t.join();
        for(int i = 1;i<10;i++){
            System.out.println("I am Main Thread " + i );
            Thread.sleep(5000);
        }
    }
}
