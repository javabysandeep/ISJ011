package _7_class_components.accessSpecifiers.p1;

public class C {
    public static void main(String[] args) {
        A ref = new A();
        // System.out.println(ref.p); // private member
        System.out.println(ref.q);
        System.out.println(ref.r);
        System.out.println(ref.s);
    }
}
