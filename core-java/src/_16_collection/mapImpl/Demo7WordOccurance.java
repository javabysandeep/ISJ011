package _16_collection.mapImpl;

import java.util.HashMap;

public class Demo7WordOccurance {
    public static void main(String[] args) {
        String str = "IT Shaala is a IT training institute based out of Pune. IT Shaala is the best training institute";
        //IT - 3, Shaala-2 ...

        HashMap<String, Integer> map = new HashMap<>();
        String[] strings = str.split(" ");
        for (String temp : strings) {
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }
        }
        System.out.println(map);
    }
}
