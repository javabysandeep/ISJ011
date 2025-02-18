package _16_collection.queueImpl;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo4PriorityQueue {
    public static void main(String[] args) {
        Queue queue = new PriorityQueue();
        //insertion
        queue.add("Suyog");
        queue.add("Pranay");
        queue.add("Kunal");
        queue.add("Ashish");
        queue.add("Rushikesh");
        queue.add("Snehal");

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
