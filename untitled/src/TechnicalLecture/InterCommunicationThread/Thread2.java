package TechnicalLecture.InterCommunicationThread;

public class Thread2 extends Thread{

    int total = 0;
    public void run(){
        synchronized (this){
            System.out.println("child thread start calculating");
            for(int i = 0;i<=10;i++){
                total = total + i;
            }
            System.out.println("child thread giving notification");
            this.notify();
        }
    }

}
