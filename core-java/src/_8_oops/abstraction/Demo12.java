package _8_oops.abstraction;

public class Demo12 {
    public static void main(String[] args) {
        interface I{
            void m1();
            void m2();
        }

        class X implements  I {
            @Override
            public void m1() {
                System.out.println("m1 overridden");
            }

            @Override
            public void m2() {

            }
        }

        I i = new X();
        i.m1();


        //anonymous class
        I i2 =  new I(){
            @Override
            public void m1() {
                System.out.println("method overridden using anonymous class");
            }

            @Override
            public void m2() {

            }
        };
        i2.m1();
    }
}
