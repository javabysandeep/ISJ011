package _7_class_components.methods;

public class C {
    public void m1() {
        System.out.println("C::m1 - instance method");
    }

    public static void m2() {
        System.out.println("C::m2 - static method");
    }

    public void m3() {
        // call m1 and m2 from A class
        //m1();//instance--> not recommended
        this.m1();//instance

        C.m2();
        //this.m2();//not recommended
        //m2();//not recommended
    }

    public static void m4() {
        // call m1 and m2 from C class
        C c = new C();
        c.m1();//instance

        C.m2();
        //c.m2();//not recommended
        //m2();//not recommended
    }

    public static void main(String[] args) {
        C c = new C();
        c.m3();

        //m4();
        //c.m4();
        C.m4();//recommended
    }
}
