package _16_collection.sorting;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class Demo6IntegerSorting {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(75);
        list.add(74);
        list.add(82);//diploma
        list.add(85);//diploma
        list.add(71);
        list.add(78);
        list.add(51);
        list.add(58);
        list.add(83);
        list.add(79);
        list.add(83);//diploma
        list.add(80);//diploma

        Collections.sort(list);

        Consumer<? super Integer> consumer1 = x->System.out.println(x);//;lambda
        Consumer<? super Integer> consumer2 = System.out::println;//;method reference
        list.forEach(consumer1);

    }
}
