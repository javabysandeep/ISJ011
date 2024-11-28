package _8_oops.inheritance;

public class AccessingMembersInMultiLevel {
    public static void main(String[] args) {
        class A {
            int a = 1;

        }
        class B extends A {
            int a = 10;
            int b = 20;

        }
        class C extends B {
            int a = 100;
            int b = 200;
            int c = 300;
            int d = 400;
        }

        System.out.println("A a = new A();");
        A a = new A();
        System.out.println(a.a); //1
        //System.out.println(a.b);//CTE
        //System.out.println(a.c);//CTE
        //System.out.println(a.d);//CTE

        System.out.println("B b = new B(); ");
        B b = new B();
        System.out.println(b.a); //10
        System.out.println(b.b);//20
        //System.out.println(b.c);//CTE
        //System.out.println(b.d);//CTE

        System.out.println("C c = new C(); ");
        C c = new C();
        System.out.println(c.a);//100
        System.out.println(c.b);//200
        System.out.println(c.c);//300
        System.out.println(c.d);//400

        System.out.println("A ab = new B();");
        A ab = new B();
        System.out.println(ab.a);//1
        //System.out.println(ab.b);
        //System.out.println(ab.c);
        //System.out.println(ab.d);

        System.out.println("A ac = new C();");
        A ac = new C();
        System.out.println(ac.a);//1
        //System.out.println(ac.b);
        //System.out.println(ac.c);
        //System.out.println(ac.d);

        System.out.println("B bc = new C();");
        B bc = new C();
        System.out.println(bc.a);//10
        System.out.println(bc.b);//20
        //System.out.println(bc.c);//CTE
        //System.out.println(bc.d);//CTE




    }
}
