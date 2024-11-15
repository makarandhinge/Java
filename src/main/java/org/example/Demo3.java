package org.example;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        List<Integer> arr2 = new ArrayList<>(arr);
        arr2.set(2, 10);
        System.out.println(arr2);

    }
}
