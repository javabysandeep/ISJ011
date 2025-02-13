package _16_collection.listImpl;

import java.util.ArrayList;
import java.util.List;

public class Demo14containsMethod {
    public static void main(String[] args) {
        List<String> candidateList = new ArrayList<>();
        candidateList.add("ashish");
        candidateList.add("kartik");
        candidateList.add("kajal");
        candidateList.add("snehal");
        candidateList.add("neha");
        candidateList.add("prathamesh");
        candidateList.add("sanika");
        candidateList.add("pranay");
        candidateList.add("arti");
        System.out.println("is yuvraj present in the given list : " +
                candidateList.contains("yuvraj"));
    }
}
