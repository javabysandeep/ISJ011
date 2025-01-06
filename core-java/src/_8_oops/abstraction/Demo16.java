package _8_oops.abstraction;

import java.util.Comparator;

public class Demo16 {
    public static void main(String[] args) {

        //1. traditional way
        class ComparatorImpl implements Comparator<Integer> {
            @Override
            public int compare(Integer number1, Integer number2) {
                return number1 - number2;
            }
        }
        Comparator<Integer> comparator1 = new ComparatorImpl();
        System.out.println(comparator1.compare(100,200));

        //2. anonymous class
        Comparator<Integer> comparator2 = new  Comparator<Integer>() {
            @Override
            public int compare(Integer number1, Integer number2) {
                return number1 - number2;
            }
        };
        System.out.println(comparator2.compare(100,200));

        //3. Lambda class
        Comparator<Integer> comparator3 = (number1, number2) -> number1 - number2;
        System.out.println(comparator3.compare(100,200));


        //4. Method reference
        Comparator<Integer> comparator4 = (number1, number2) -> number1 - number2;
        System.out.println(comparator4.compare(100,200));
    }
}
