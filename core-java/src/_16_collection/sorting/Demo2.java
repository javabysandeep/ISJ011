package _16_collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //primitive is converted to wrapper object format and that is added to the collection
        list.add(100);
        list.add(30);
        list.add(99);
        list.add(91);
        list.add(910);
        list.add(87);
        Collections.sort(list);
        System.out.println(list);
    }
}
