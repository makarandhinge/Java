import java.util.*;

public class hashsetex {

    public static void main(String[] args) {

        HashSet hs = new HashSet();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("E");
        hs.add("D");
        System.out.println(hs.add("A"));
        System.out.println(hs);

        LinkedHashSet l = new LinkedHashSet();
        l.add("A");
        l.add("B");
        l.add("C");
        System.out.println(l);

        TreeSet t = new TreeSet(new Mycomparator());
//        t.add("A");
//        t.add("B");
//        t.add("C");
//        t.add("F");
//        t.add("Z");
//        t.add("Q");
//        t.add("Y");
//        t.add("M");
//        t.add("1");
//        t.add("~");
//        t.add("a");
//        t.add(Integer.toString(1));
//        System.out.println(t);
//        System.out.println("A".compareTo("A"));
        t.add(1);
        t.add(2);
        t.add(3);
        System.out.println(t);
    }


   static class Mycomparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            Integer i1 = (Integer) o1;
            Integer i2 = (Integer) o2;
            if(i1 < i2){
                return +1;
            }else if(i1 > i2){
                return -1;
            }else{
                return 0;
            }
/*
return -i1.compareTo(i2);
 */
        }
    }
}