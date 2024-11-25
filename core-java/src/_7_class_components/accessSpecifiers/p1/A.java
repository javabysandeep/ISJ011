package _7_class_components.accessSpecifiers.p1;

public class A {
    private int p = 1;
    public int q = 2;
    protected int r = 3;
    //default
    int s = 4;

    public static void main(String[] args) {
        A ref = new A();
        System.out.println(ref.p);
        System.out.println(ref.q);
        System.out.println(ref.r);
        System.out.println(ref.s);
    }
}
