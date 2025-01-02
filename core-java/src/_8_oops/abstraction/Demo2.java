package _8_oops.abstraction;

public class Demo2 {
    public static void main(String[] args) {
        class Concrete {
            //abstract void m1();//CTE
        }
        abstract class A {
            //all components
            int a = 10;
            static int b = 20;

            void im() {
                System.out.println("instance method");
            }

            static void sm() {
                System.out.println("static method");
            }

            A() {
                System.out.println("constructor");
            }

            {
                System.out.println("instance block");
            }

            static {
                System.out.println("static block");
            }

            static class Nested {
            }

            abstract void m1();
        }

        //A a = new A();//cant create object of an abstract class


    }
}
