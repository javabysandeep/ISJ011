package _16_collection.listImpl;

import java.util.ArrayList;
import java.util.List;

public class Demo6 {
    public static void main(String[] args) {

        // ArrayList - duplicate, same or diff data, null(*), IO, best- read, no thread safety
        //10,20,30,40,50,60, 50
        //Al, LL, V,S, HS, LHS, TS, PQ
        List list = new ArrayList();
        //add single element
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(40);
        list.add(null);
        list.add(null);
        list.add(null);
        list.add("abc");
        list.add(true);

        System.out.println(list.toString());
        System.out.println(list);

    }
}
