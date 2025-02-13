package _16_collection.listImpl;

import java.util.ArrayList;
import java.util.List;

public class Demo12RetainAll {
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

        //retainAll() : keeps the specified list of elements and removes the rest of elements

        List<String> selectCadidatesList = new ArrayList<>();
        selectCadidatesList.add("neha");
        selectCadidatesList.add("kartik");

        System.out.println("Before result " + candidateList);
        candidateList.retainAll(selectCadidatesList);
        System.out.println("After result " + candidateList);


    }
}
