package _8_oops.abstraction;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo8 {
    public static void main(String[] args) {

        @FunctionalInterface
        interface NumberProcessor {
            int process(int number);
            static void sm1(){}
            static void sm2(){}
            default void dm1(){}
            default void dm2(){}
        }

        interface StringProcessor {
            String process(String str);
            String process2(String str);
        }
    }
}
