import java.util.Comparator;
import java.util.PriorityQueue;

public class Queue {

    public static void main(String[] args) {

        PriorityQueue p = new PriorityQueue( new MyComparator());
        p.offer("Makarand");
        p.offer("Adarsh");
        p.offer("Sanjay");

        System.out.println(p);
        System.out.println(p.peek());
        System.out.println(p.poll());
        System.out.println(p);
    }

    static class MyComparator implements Comparator{
        public int compare(Object o1,Object o2){
            String s1 = (String) o1;
            String s2 = (String) o2;
            return s1.compareTo(s2);
        }
    }
}
