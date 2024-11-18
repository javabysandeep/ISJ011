package _7_class_components.constructors;

public class A {
    int x;
    int y;

    A() {
        //this(100, 200);
        //super();// it is implicitly added
        System.out.println("zero parameterized constructor");
    }

    A(int x, int y) {
        this();
        this.x = x;
        this.y = y;
        System.out.println("parameterized constructor");
    }
    //normal java method
    void A(String x){

    }

    public static void main(String[] args) {
        A a = new A(100, 200);
        System.out.println(a.x + "\t" + a.y);
    }
}
