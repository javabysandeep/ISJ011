package _16_collection.listImpl;

import java.util.*;
import java.util.function.Consumer;

public class Demo19VectorReadOperation {
    public static void main(String[] args) {
        Vector<String> list = new Vector<>();
        //cursor = 0
        //size = 9
        //curosor!=size
        list.add("ashish"); //next --> cursor++
        list.add("kartik");//next --> cursor++
        list.add("kajal");//next --> cursor++
        list.add("snehal");//next --> cursor++
        list.add("neha");//next --> cursor++
        list.add("prathamesh");//next --> cursor++
        list.add("sanika");//next --> cursor++
        list.add("pranay");//next --> cursor++
        list.add("arti");//next --> cursor++
        //9 !=9

        //retrieval operation

        //1. complete list print
        System.out.println(list);

        //2. single element access using index
        System.out.println("element present at 0th index : " + list.get(0));
        System.out.println("element present at last index : " + list.get(list.size() - 1));
        // System.out.println("element present at 0th index : "+list.getFirst());
        //System.out.println("element present at 0th index : "+list.getLast());


        //3. multiple values - traditional for loop
        System.out.println("traditional for loop");
        for (int index = 0; index < list.size(); index++) {
            System.out.println(list.get(index));
        }


        //4. multiple values - enhanced for loop
        System.out.println("enhanced for loop");
        for (String temp : list) {
            System.out.println(temp);
        }


        //5. using java 8 - forEach method
        System.out.println("using java 8 - forEach method - lambda");
        Consumer consumer = input -> System.out.println(input);
        list.forEach(consumer);


        //6. using java 8 - forEach method - method Reference
        System.out.println("using java 8 - forEach method - method reference");
        list.forEach(System.out::println);


        //7. using Enumeration only for Vector --> cursor
        System.out.println("reading elements from given list using Iterator");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //8. using Enumeration only for Vector --> cursor
        System.out.println("reading elements from given list using Enumeration");
        Enumeration<String> enumeration = list.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        //9. using ListIterator only for List --> cursor
        System.out.println("reading elements from given list using ListIterator");
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

    }
}
