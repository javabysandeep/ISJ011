package _16_collection.listImpl;

import java.util.ArrayList;
import java.util.List;

public class Demo4 {
    public static void main(String[] args) {
        //10, 20, 30, 40, 50
        //1. variable
        int v1 = 10;
        int v2 = 20;
        int v3 = 30;
        int v4 = 40;
        int v5 = 50;

        //2. array
        int[] array = {10, 20, 30, 40, 50};


        //3. Collection
        //AL, LL, V, S, HS, lHS, TS, PQ
        List list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);



    }
}
