package _16_collection.listImpl;

import java.util.LinkedList;

public class Demo21LikedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(100);
        linkedList.add(100);
        linkedList.add(100.05f);
        linkedList.add(null);
        linkedList.add(null);
        linkedList.add(null);
        linkedList.add("abc");
        System.out.println(linkedList);

        LinkedList linkedList2 = new LinkedList();
        linkedList2.addAll(linkedList);
        System.out.println(linkedList2);

    }
}
