package _16_collection;

import java.util.ArrayList;
import java.util.List;

public class Demo5 {
    public static void main(String[] args) {
        //homo, hetero, null, duplicate
        //insertion order is maintained
        List list = new ArrayList<>();
        list.add(100);
        list.add(100);
        list.add(200);
        list.add("abc");
        list.add("abc");
        list.add(true);
        list.add(100.30f);
        list.add(null);
        list.add(null);
        list.add(null);
        System.out.println(list);
        System.out.println("length "+list.size());
    }
}
