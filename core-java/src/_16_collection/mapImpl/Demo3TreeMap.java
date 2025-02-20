package _16_collection.mapImpl;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo3TreeMap {
    public static void main(String[] args) {
        Map map = new TreeMap();
        map.put(1, null);
        map.put(1, null);
        map.put(2, null);
        map.put(4, null);
        map.put(3, null);
        //  map.put("abc", "abc");
        // map.put("xyz", null);
        //  map.put(null, null);
        // map.put(null, "abc");

        System.out.println(map);
    }
}
