package _7_class_components.nestedClasses;

public class NonStaticNestedOrInnerClassDemo {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("A class instance variable " + a.x);

        A.B b = a.new B();
        System.out.println("access inner class members");
        System.out.println(b.iv);
        b.instanceMethod();

    }
}
