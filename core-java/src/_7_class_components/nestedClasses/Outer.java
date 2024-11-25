package _7_class_components.nestedClasses;

public class Outer {
    static int x = 100;
    static class StaticNested {
        int iv = 1;
        void m1() {
            System.out.println("instance method");
        }

        static int sv = 2;
        static void m2() {
            System.out.println("static method");
        }
    }
}
