package _16_collection.listImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Demo13RemoveIf {
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

        //removeIf() : remove the elements based on condition

        System.out.println("Before result " + candidateList);

        candidateList.removeIf(x -> x.startsWith("k"));

        System.out.println("After result " + candidateList);


    }
}
