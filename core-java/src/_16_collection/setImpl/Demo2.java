package _16_collection.setImpl;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        //HS
        //LHS
        //TS
        Set set = new LinkedHashSet();
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
