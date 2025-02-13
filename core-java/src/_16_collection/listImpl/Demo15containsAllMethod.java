package _16_collection.listImpl;

import java.util.ArrayList;
import java.util.List;

public class Demo15containsAllMethod {
    public static void main(String[] args) {
        List<String> selectionList = new ArrayList<>();
        selectionList.add("ashish");
        selectionList.add("kartik");
        selectionList.add("kajal");
        selectionList.add("snehal");
        selectionList.add("neha");
        selectionList.add("prathamesh");
        selectionList.add("sanika");
        selectionList.add("pranay");
        selectionList.add("arti");


        List<String> checkResultList = new ArrayList<>();
       // checkResultList.add("yuraj");
        //checkResultList.add("kunal");
        checkResultList.add("arti");
        checkResultList.add("sanika");


        System.out.println("is list present in the given list : " +
                selectionList.containsAll(checkResultList));
    }
}
