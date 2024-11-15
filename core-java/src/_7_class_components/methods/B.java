package _7_class_components.methods;

public class B {
    public void m3() {
        // call m1 and m2 from A class
        A a = new A();
        a.m1();//instance

        A.m2();
        //a.m2();//not recommended
    }

    public static void m4() {
        // call m1 and m2 from A class
        A a = new A();
        a.m1();//instance

        A.m2();
        //a.m2();//not recommended
    }
}
