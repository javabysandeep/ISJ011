package _7_class_components.nestedClasses;

public class LocalInnerClassDemo {
    public static void main(String[] args) {

        //local inner class
        class A {
            int iv = 100;

            void instanceMethod() {
                System.out.println("instance method");
            }
        }

        A a = new A();

        System.out.println(a.iv);
        a.instanceMethod();
    }
}
