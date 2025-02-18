package _16_collection.setImpl;

import java.util.Set;
import java.util.TreeSet;

public class Demo6TreeSetStrings {
    public static void main(String[] args) {
        Set<String> studentNameList = new TreeSet<>();
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

        for (String temp : studentNameList) {
            System.out.println(temp);
        }
    }
}
