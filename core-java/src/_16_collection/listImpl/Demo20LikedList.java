package _16_collection.listImpl;

import java.util.LinkedList;

public class Demo20LikedList {
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
    }
}
