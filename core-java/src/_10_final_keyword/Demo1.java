package _10_final_keyword;

public class Demo1 {
    public static void main(String[] args) {
        final class Parent {}
        //final class cannot be extended or inherited
        //class Child extends Parent {}


        //2. final methods cannot be overridden
        class A {
            final void m1(){
                System.out.println("A:m1");
            }
        }
        class B extends A{
           /* @Override
            void m1() {
                System.out.println("B:m1");
            }*/
        }
    }
}
