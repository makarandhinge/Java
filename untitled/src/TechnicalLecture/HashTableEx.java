package TechnicalLecture;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class HashTableEx {
    public static void main(String[] args) {

        String student[] = {"Kamlesh","Makarand","Aditi","Babita"};
        List studentList = Arrays.asList(student);
        System.out.println(studentList);

        Hashtable h = new Hashtable();
        h.put(new Temp(5),"A");
        h.put(new Temp(2),"B");
        h.put(new Temp(6),"C");
        h.put(new Temp(15),"D");
        h.put(new Temp(23),"E");
        h.put(new Temp(16),"F");

        System.out.println(h);


    }
    static class Temp{
        int i;

        public Temp(int i){
            this.i = i;
        }
        public int hashCode(){
            return 1;
        }
        public String toString(){
            return "Temp{" + "i" + i +'}';
        }

    }


}
