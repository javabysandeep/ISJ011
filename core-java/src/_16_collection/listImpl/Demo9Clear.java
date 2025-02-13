package _16_collection.listImpl;

import java.util.ArrayList;
import java.util.List;

public class Demo9Clear {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(100);
        list.add(200);
        //list.add("string data");//CTE
        list.add(99);
        list.add(98);
        list.add(97);
        System.out.println("before removal "+"\t"+"size = "+list.size());
        System.out.println(list);

        //remove operation
        //clear method removes all the elements
        list.clear();

        System.out.println("after removal"+"\t"+"size = "+list.size());
        System.out.println(list);


    }
}
