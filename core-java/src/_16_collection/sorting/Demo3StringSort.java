package _16_collection.sorting;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Demo3StringSort {
    public static void main(String[] args) {
        List<String> bookList = new LinkedList<>();
        bookList.add("Inception");
        bookList.add("Rich Dad Poor Dad");
        bookList.add("Dogalapan");
        bookList.add("Think and Grow Rich");
        bookList.add("Discipline");
        bookList.add("Champak");
        bookList.add("do or die");
        bookList.add("Ramaayan");
        bookList.add("Mahabharat");
        bookList.add("Bhagwad Gita");
        bookList.add("Akbar & Birbal");

        Collections.sort(bookList);

        bookList.forEach(System.out::println);
    }
}
