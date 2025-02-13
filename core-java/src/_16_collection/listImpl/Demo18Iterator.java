package _16_collection.listImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Demo18Iterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ashish");
        list.add("kartik");
        list.add("kajal");
        list.add("snehal");
        list.add("neha");
        list.add("prathamesh");
        list.add("sanika");
        list.add("pranay");
        list.add("arti");

        System.out.println("reading elements from given list using Iterator");
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
