package _16_collection;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        CustomArrayList customArray = new CustomArrayList();
        customArray.add(10);
        customArray.add(20);
        customArray.add(40);
        customArray.add(30);
        customArray.add("string data");
        customArray.add("string data");
        customArray.add("string data");
        customArray.add("string data");
        customArray.add("string data");
        customArray.add("string data");
        customArray.add("string data");
        customArray.print();
        System.out.println("Capacity " + customArray.capacity);
        System.out.println("Size " + customArray.size);
    }
}
