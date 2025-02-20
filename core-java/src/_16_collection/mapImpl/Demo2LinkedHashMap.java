package _16_collection.mapImpl;

import java.util.LinkedHashMap;
import java.util.Map;

public class Demo2LinkedHashMap {
    public static void main(String[] args) {
        Map map = new LinkedHashMap();
        map.put(1, null);
        map.put(1, null);
        map.put(2, null);
        map.put(2, null);
        map.put("abc", null);
        map.put("abc", "abc");
        map.put("xyz", null);
        map.put(null, null);
        map.put(null, "abc");

        System.out.println(map);
    }
}
