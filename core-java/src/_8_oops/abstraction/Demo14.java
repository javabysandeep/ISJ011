package _8_oops.abstraction;

public class Demo14 {
    public static void main(String[] args) {
        interface Predicate {
            boolean test(int number);

            public static void m1(){}
            public static void m2(){}
            public default void m3(){}
        }
        //1. traditional way
        class EvenTest implements Predicate {
            @Override
            public boolean test(int number) {
                return number % 2 == 0;
            }
        }
        Predicate eventTest = new EvenTest();
        System.out.println("is even "+eventTest.test(10));

        //2. anonymous class way
        Predicate eventTest2 =  new Predicate() {
            @Override
            public boolean test(int number) {
                return number % 2 == 0;
            }
        } ;
        System.out.println("is even "+eventTest2.test(11));

        //3. lambda expression
        Predicate eventTest3 =  number -> number%2==0;
        System.out.println("is even "+eventTest3.test(12));

    }
}
