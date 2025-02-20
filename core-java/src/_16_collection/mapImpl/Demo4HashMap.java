package _16_collection.mapImpl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo4HashMap {
    public static void main(String[] args) {
        Map<String, Integer> studentMarks = new HashMap<>();
        //name --> marks
        studentMarks.put("Ashish", 74);
        studentMarks.put("Sakshi", 83);
        studentMarks.put("Kajal", 93);
        studentMarks.put("Shweta", 79);
        studentMarks.put("Suyog", 58);
        studentMarks.put("Arti", 70);

        //search
        System.out.println(studentMarks.containsKey("Arti"));
        System.out.println(studentMarks.containsValue(74));

        //remove
        studentMarks.remove("Arti");
        System.out.println(studentMarks);

        //projection
        //keys
        Set<String> studentNamesKeys = studentMarks.keySet();
        System.out.println("keys " + studentNamesKeys);

        //values
        Collection<Integer> studentMarksValues = studentMarks.values();
        System.out.println("Values " + studentMarksValues);

        //entrySet
        System.out.println("entries");
        Set<Map.Entry<String, Integer>> entries = studentMarks.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }

        System.out.println(studentMarks.get("Arti"));
    }
}
