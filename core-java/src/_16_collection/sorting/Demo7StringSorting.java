package _16_collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo7StringSorting {
    public static void main(String[] args) {
        List<String> studentNameList = new ArrayList<>();
        studentNameList.add("kunal");
        studentNameList.add("rushikesh");
        studentNameList.add("pranay");
        studentNameList.add("suyog");
        studentNameList.add("sakshi");
        studentNameList.add("shweta");
        studentNameList.add("shreyash");
        studentNameList.add("pratham");
        studentNameList.add("neha");
        studentNameList.add("snehal");
        studentNameList.add("sanika");
        studentNameList.add("mayuri");

        Collections.sort(studentNameList);

        studentNameList.forEach(System.out::println);
    }
}
