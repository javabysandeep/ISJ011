package _8_oops.abstraction;

public class Demo4 {
    public static void main(String[] args) {
        interface I1 {
            public static final int variable = 100;
            int variable2 = 100;// by default variables are public static final

            //instance methods are not allowed
            //void im(){}//CTE

            //abstract methods - by default methods are public abstract
            public abstract void am();
            void am2();

            // static methods are allowed from java 8
            static void sm(){}

            //default are allowed from java 8
            default void dm(){}

            //constructors are not allowed
            //I1(){}//CTE

            //instance block and static block are not allowed
            //{}//CTE
            //static {}//CTE

            //nested classes - by default public static
            public static class Nested{}
            class Nested2{}

        }
    }
}
