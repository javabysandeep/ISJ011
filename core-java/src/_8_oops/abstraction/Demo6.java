package _8_oops.abstraction;

public class Demo6 {
    public static void main(String[] args) {
        interface I1 {
            void m1();
        }

        interface I2 {
            void m1();
            void m2();
        }

        class A implements I1, I2{
            @Override
            public void m1() {
                System.out.println("m1");
            }

            @Override
            public void m2() {
                System.out.println("m2");
            }
        }

        I1 i1 = new A();
        i1.m1();

        I2 i2 = new A();
        i2.m1();
        i2.m2();

    }
}