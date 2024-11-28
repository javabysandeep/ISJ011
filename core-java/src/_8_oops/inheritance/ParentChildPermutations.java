package _8_oops.inheritance;

public class ParentChildPermutations {
    public static void main(String[] args) {
        class Parent {
            int a = 100;
            int b = 200;

            void m1() {
                System.out.println("Parent::m1");
            }

            void m2() {
                System.out.println("Parent::m2");
            }
        }
        class Child extends Parent {
            int b = 2000;
            int c = 3000;

            void m2() {
                System.out.println("Child::m2");
            }

            void m3() {
                System.out.println("Child::m3");
            }

        }
    /*

        //case 01 : Parent parent = new Parent();
        //  access members only from parent class
        Parent parent = new Parent();
        System.out.println(parent.a); //100 --Parent
        System.out.println(parent.b); //200 - Parent
        //     System.out.println(parent.c); //CTE - child
        parent.m1(); //m1 -- Parent
        parent.m2(); //m2 - Parent
        //     parent.m3();//CTE - child
    */

    /*
        //case 02 : Child child = new Child();
            // 2.1 - members only present in parent class --> Access it from Parent
            // 2.2 - members only present in child class --> access it from child
            // 2.3 - members present in both parent and child --> acces it from child
        Child child = new Child();
        System.out.println(child.a); //100 --Parent
        System.out.println(child.b); //2000 - Child
        System.out.println(child.c); //3000 - child
        child.m1(); //m1 -- Parent
        child.m2(); //m2 - child
        child.m3();//m3 - child
        */

        //case 03 : Parent pc = new Child();
        // 3.1 - members only present in parent class --> Access it from Parent
        // 3.2 - members only present in child class --> CTE
        // 3.3 - members present in both parent and child --> variables from Parent and methods  from child
        Parent pc = new Child();
        System.out.println(pc.a); //100 --Parent
        System.out.println(pc.b); //200 - Parent
        //System.out.println(pc.c); //CTE - only present in child
        pc.m1(); //m1 -- Parent
        pc.m2(); //m2 - child
        //pc.m3();//m3 - CTE - only present in child

        // case 04-  Child cp = new Parent(); //CTE
        //Child cp = new Parent();
    }
}
