package TechnicalLecture.Synchronized;

public class Threa extends Thread{

    Display d ;
    String name ;

    public Threa(Display d,String name){
        this.d = d;
        this.name = name;
    }

    public void run(){
        d.wish(name);
    }
}
