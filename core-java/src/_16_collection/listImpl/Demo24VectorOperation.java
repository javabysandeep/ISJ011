package _16_collection.listImpl;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.function.Consumer;

public class Demo24VectorOperation {
    public static void main(String[] args) {
        Vector<String> list = new Vector<>();
        list.add("ashish");
        list.add("kartik");
        list.add("kajal");
        list.add("snehal");
        list.add("neha");
        list.add("prathamesh");
        list.add("sanika");
        list.add("pranay");
        list.add("arti");


        //way 01 : print the reference
        System.out.println(" way 01 : print the reference");
        System.out.println(list);

        //way 02 : traditional for loop
        System.out.println(" way 02 : traditional for loop ");
        for (int index = 0; index < list.size(); index++) {
            System.out.print(list.get(index) + " ");
        }

        //way 03 : enhanced for loop
        System.out.println("\nway 03 : enhanced for loop ");
        for (String temp : list) {
            System.out.print(temp + " ");
        }

        //way 04 : forEach method
        System.out.println("\nway 04 : forEach method");
        //    void accept(T t);
        Consumer<String> consumer = System.out::println;
        list.forEach(consumer);

        //way 05 : Iterator
        System.out.println("way 05 : iterator");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //way 06 : ListIterator
        System.out.println("way 06 : listiterator");
        Iterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        //way 07 : Enumeration
        System.out.println("way 07 : Enumeration");
        Enumeration<String> enumeration = list.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

    }
}
