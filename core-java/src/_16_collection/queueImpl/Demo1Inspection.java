package _16_collection.queueImpl;

import java.util.LinkedList;
import java.util.Queue;

public class Demo1Inspection {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        //insertion
       /* queue.add("Ashish");
        queue.add("Suyog");
        queue.add("Pranay");
        queue.add("Kunal");
        queue.add("Rushikesh");
        queue.add("Snehal");*/

        //examine operation
        System.out.println("who's next "+queue.peek());//null
        System.out.println("who's next "+queue.element());//NoSuchElementException
    }
}
