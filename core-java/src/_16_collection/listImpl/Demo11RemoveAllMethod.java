package _16_collection.listImpl;

import java.util.ArrayList;
import java.util.List;

public class Demo11RemoveAllMethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(100);
        list.add(200);
        list.add(99);
        list.add(98);
        list.add(97);
        System.out.println("before removal "+"\t"+"size = "+list.size());
        System.out.println(list);

        //remove operation
        //removeAll method removes the specified list elements
        List<Integer> deleteList = new ArrayList<>();
        deleteList.add(100);
        deleteList.add(200);
        deleteList.add(97);

        list.removeAll(deleteList);

        System.out.println("after removal"+"\t"+"size = "+list.size());
        System.out.println(list);


    }
}
