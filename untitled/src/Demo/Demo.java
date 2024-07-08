package Demo;

import java.util.ArrayList;
import java.util.List;

public class Demo {



    public static void main(String[] args) {

        Number n = new Number();

        List l = new ArrayList();
        l.add(n.getid());
        System.out.println(l);

    }
}

class Number{
    private Long id = 1l;
    private float unit;


    public Long getid(){
        return id;
    }
    public float getunit(){
        return unit;
    }
}
