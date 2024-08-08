package TechnicalLecture.Synchronized;

public class SynchronizedDemo {

    public static void main(String[] args) {
        Display d = new Display();
        Display d1 = new Display();
        Threa t1 = new Threa(d,"dhoni");
        Threa t2 = new Threa(d1,"kholi");
        t1.start();
        t2.start();
    }
}
