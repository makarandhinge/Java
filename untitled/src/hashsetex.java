import java.util.*;

public class hashsetex {

    public static void main(String[] args) {

//        HashSet hs = new HashSet();
//        hs.add("A");
//        hs.add("B");
//        hs.add("C");
//        hs.add("E");
//        hs.add("D");
//        System.out.println(hs.add("A"));
//        System.out.println(hs);
//
//        LinkedHashSet l = new LinkedHashSet();
//        l.add("A");
//        l.add("B");
//        l.add("C");
//        System.out.println(l);
//
//        TreeSet t = new TreeSet(new Mycomparator());
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
//        t.add("Makarand");
//        t.add("Shark");
//        t.add("Manuj");
//        t.add("Shruk");
//        t.add("Sajjad");
//        t.add("Shruk");
//        System.out.println(t);

//        HashMap m = new HashMap();
//        System.out.println(m.put(1,"Makarand"));
//        System.out.println(m.put(2,"Adarsh"));
//        System.out.println(m.put(1,"KK"));
//        System.out.println(m);
//
//        Set allkeys = m.keySet();
//        System.out.println(allkeys);
//        Collection c = m.values();
//        System.out.println(c);
//        System.out.println(m.values());
//        Set e = m.entrySet();
//        Iterator itr = e.iterator();
//        while(itr.hasNext()){
//           Map.Entry allkeyvalues =(Map.Entry)  itr.next();
//           if(allkeyvalues.getKey().equals(2)){
//               allkeyvalues.setValue("sachin tendulkar");
//           }
//        }
//        System.out.println(itr);
//        System.out.println(c);
//
//        IdentityHashMap id = new IdentityHashMap();
//        String s1 = new String("Makarand");
//        String s2 = new String("Makarand");
//        id.put(s1,"value");
//        id.put(s2,"value");
//        id.put("Makarand","value");
//        String s = "Makarand";
//        id.put(s,"value");
//        System.out.println(id);


        TreeMap tm = new TreeMap(new Mycompare());
        tm.put(100,"Makarand");
        tm.put(101,"Adarsh");
        tm.put(102,"Shreyas");

        System.out.println(tm);



    }
    static class Mycompare implements Comparator{

        @Override
        public int compare(Object o1, Object o2) {
            Integer i1 = (Integer) o1;
            Integer i2 = (Integer) o2;
            return i2.compareTo(i1);
        }
    }

//   static class Mycomparator implements Comparator {
//        @Override
//        public int compare(Object o1, Object o2) {
//            String i1 = (String) o1;
//            String i2 = (String) o2;
//            if(i1 < i2){
//                return +1;
//            }else if(i1 > i2){
//                return -1;
//            }else{
//                return 0;
//            return -i1.compareTo(i2);
//            }
/*
return -i1.compareTo(i2);
 */


        }

