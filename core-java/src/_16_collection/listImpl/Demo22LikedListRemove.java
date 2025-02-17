package _16_collection.listImpl;

import java.util.LinkedList;

public class Demo22LikedListRemove {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(100);
        linkedList.add(100);
        linkedList.add(100.05f);
        linkedList.add(null);
        linkedList.add("xyz");
        linkedList.add(null);
        linkedList.add("abc");
        System.out.println("Search : " + linkedList.contains("xyz"));

        System.out.println("Before removal");
        System.out.println(linkedList);

        //remove single element
        linkedList.remove("abc");

        //remove multiple elements
        LinkedList deleteList = new LinkedList();
        deleteList.add("xyz");
        deleteList.add(null);

        linkedList.removeAll(deleteList);

        //remove all elements
        linkedList.clear();

        System.out.println("After removal");
        System.out.println(linkedList);


    }
}
