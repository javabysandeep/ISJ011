package _16_collection.mapImpl;

import java.util.HashMap;

public class Demo6 {
    public static void main(String[] args) {
        String str = "IT Shaala";
        //I - 1, T-1, -1, S-1, h-1, a-3, l-1

        HashMap<Character, Integer> map = new HashMap<>();
        for (int index = 0; index < str.length(); index++) {
            char c = str.charAt(index);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);

    }
}
