package _16_collection.listImpl;

import java.util.ArrayList;
import java.util.List;

public class Demo7AddAddAllMethod {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        //add single element
        list1.add(10);
        list1.add(20);

        List list2 = new ArrayList();
        list2.add(100);
        list2.add(200);

        //adds multiple elements in the given list
        list2.addAll(list1);

        System.out.println(list1);
        System.out.println(list2);


    }
}
