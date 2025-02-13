package _16_collection.listImpl;

import java.util.ArrayList;
import java.util.List;

public class Demo8 {
    public static void main(String[] args) {

        //generic --> type safety --> given list will have only integer type of data.
        List<Integer> list = new ArrayList();
        list.add(100);
        list.add(200);

        //list.add("string data");//CTE
    }
}
