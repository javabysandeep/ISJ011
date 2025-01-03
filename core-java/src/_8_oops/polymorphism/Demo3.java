package _8_oops.polymorphism;

public class Demo3 {
    public static void main(String[] args) {
        class  Parent {

            void m1(){
                System.out.println("m1 method");
            }

            public static void main(String[] args) {

            }
        }
        class Child extends Parent{
            @Override
            void m1() {
                System.out.println("m1 overriden");
            }

            public static void main(String[] args) {

            }
        }

        Child child = new Child();
        child.m1();
        Child.main(new String[]{"abc","xyz"});
        Parent.main(null);
    }
}
