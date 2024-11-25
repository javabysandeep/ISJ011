package _7_class_components.blocks;

public class B {
    static {
        System.out.println("static block : B");
    }

    {
        System.out.println("instance block : B");
    }

    B() {
        //1. super class constructor or same class instructor
        super();
        //2. instance block of the same class
        System.out.println("zero param constructor : B");
    }
    void m1(){
        System.out.println("B:m1");
    }
    static void m2(){
        System.out.println("B:m2");
    }
}
