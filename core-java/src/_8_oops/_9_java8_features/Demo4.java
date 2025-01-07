package _8_oops._9_java8_features;

public class Demo4 {
    public static void main(String[] args) {
        interface I1 {
            default void m1() {
                System.out.println("I1::m1 default method");
            }
        }

        interface I2 {
            default void m1() {
                System.out.println("I2:: m1 default method");
            }
        }
        class C implements I1, I2 {
            @Override
            public void m1() {
                //new logic
                //call the interface default method
                I1.super.m1();
                I2.super.m1();
            }
        }

        I1 i1 = new C();
        i1.m1();
    }
}
