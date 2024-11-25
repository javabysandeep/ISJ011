package _7_class_components.accessSpecifiers.p1;

public class Y {
    public static void main(String[] args) {
        X x = new X();
        //System.out.println(x.a);//private
        System.out.println(x.b);
        System.out.println(x.c);
        System.out.println(x.d);
    }
}
