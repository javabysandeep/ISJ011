package _8_oops.abstraction;

public class Demo9 {
    public static void main(String[] args) {

        //1. creating subclass of Concrete class
        class ConcreteClass { }
        class Subclass1 extends ConcreteClass {}
        abstract class Subclass2 extends ConcreteClass {}

        //2. creating subclass of an abstract class
        abstract class A{}
        class Subclass3 extends A {}
        abstract class  Subclass4 extends A {}

        //3. creating subclass of an interface
        interface I1{}

        class X implements I1{}
        abstract class Y implements I1{}
        interface I2 extends I1{}
    }
}
