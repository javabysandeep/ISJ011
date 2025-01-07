package _8_oops._9_java8_features;

public class Demo3DefaultMethods {
    public static void main(String[] args) {
        interface X{
            void m1();
            void m2();
            default void m3(){}
        }
        X x1 = new X() {
            @Override
            public void m1() {
                System.out.println("x1 m1");
            }

            @Override
            public void m2() {
                System.out.println("x1 m2");
            }
        };
        X x2 = new X() {
            @Override
            public void m1() {
                System.out.println("x2 m1");
            }

            @Override
            public void m2() {
                System.out.println("x2 m2");
            }
        };
        X x3 = new X() {
            @Override
            public void m1() {
                System.out.println("x3 m1");
            }

            @Override
            public void m2() {
                System.out.println("x3 m2");
            }
        };
        //..... 10000000 number of subclass or implementations

    }
}
