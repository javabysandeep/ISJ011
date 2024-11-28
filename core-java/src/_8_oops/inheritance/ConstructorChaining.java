package _8_oops.inheritance;

public class ConstructorChaining {
    public static void main(String[] args) {
        class A {
            static {
                System.out.println("A::static block");
            }

            {
                System.out.println("A::instance block");
            }

            A() {
                super();
                System.out.println("A::con");
            }
        }
        class B extends A {
            static {
                System.out.println("B::static block");
            }

            {
                System.out.println("B::instance block");
            }

            public B() {
                super();
                System.out.println("B::con");
            }
        }
        class C extends B {
            static {
                System.out.println("C::static block");
            }

            {
                System.out.println("C::instance block");
            }

            public C() {
                super();
                System.out.println("C::con");
            }
        }
        C c = new C();

        //output
        //1. A::static block
        //2. B::static block
        //3. C::static block
        //4. A::instance block
        //5. A::constructor
        //6. B::instance block
        //7. B::constructor
        //8. C:: instance block
        //9. C:: constructor

    }
}
