package _7_class_components.accessSpecifiers.p2;

import _7_class_components.accessSpecifiers.p1.A;

public class B {
    public static void main(String[] args) {
        A ref = new A();
        //System.out.println(ref.p); // private member

        System.out.println(ref.q);// public member

        //no relationship
        //System.out.println(ref.r); //protected

        // System.out.println(ref.s); //default
    }
}
