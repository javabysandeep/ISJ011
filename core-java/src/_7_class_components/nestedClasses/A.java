package _7_class_components.nestedClasses;

public class A {

        int x = 100; //instance variable

    //inner class or non-static nested class
    class B {
        int iv = 1;

        void instanceMethod() {
            System.out.println("instance method");
        }

        /*static int sv = 2;

        static void staticMethod() {
            System.out.println("static method");
        }*/
    }
}
