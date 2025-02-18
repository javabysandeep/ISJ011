package _16_collection.setImpl;

import java.util.HashSet;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        //HS
        //LHS
        //TS
        Set set = new HashSet();
        set.add(100);
        set.add(100);
        set.add(200);
        set.add("abc");
        set.add("abc");
        set.add(null);
        set.add(null);
        set.add(null);
        System.out.println(set);
    }
}
