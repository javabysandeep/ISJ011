package _16_collection.queueImpl;

import java.util.LinkedList;
import java.util.Queue;

public class Demo3Removal {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        //insertion
        queue.add("Ashish");
        queue.add("Suyog");
        queue.add("Pranay");
        queue.add("Kunal");
        queue.add("Rushikesh");
        queue.add("Snehal");

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println("queue size "+queue.size());

    }
}
