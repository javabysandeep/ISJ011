package _16_collection.mapImpl;

import java.util.HashMap;
import java.util.Map;

public class Demo1HashMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, null);
        map.put(1, null);
        map.put(2, null);
        map.put(2, null);
        map.put("abc", null);
        map.put("abc", null);
        map.put("xyz", null);
        map.put(null, null);
        map.put(null, "abc");

        System.out.println(map);
    }
}
