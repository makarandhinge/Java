package TechnicalLecture;

public class Demon {
    public static void main(String[] args) {

//        System.out.println(Thread.currentThread().isDaemon());
        MyThread t1 = new MyThread();
//        System.out.println(t1.isDaemon());
        t1.setDaemon(true);

        t1.start();
        System.out.println("Main Thread");


    }

}

