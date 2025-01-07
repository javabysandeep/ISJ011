package _8_oops._9_java8_features;

public class Demo1MethodReference {
    public static void main(String[] args) {
        class Test {
            public static void m1() {
                System.out.println("Test class static m1 method");
            }

            public void m2() {
                System.out.println("Test class instance m2 method");
            }

            Test() {
                System.out.println("Test class constructor");
            }
        }

        //1. method reference of a static method
        Runnable runnable = Test::m1;
        runnable.run();

        //2. method reference of an instance method
        Test test = new Test();
        Runnable runnable2 = test::m2;
        runnable2.run();

        //3. method reference of a constructor
        Runnable runnable3 = Test::new;
        runnable3.run();


    }
}
