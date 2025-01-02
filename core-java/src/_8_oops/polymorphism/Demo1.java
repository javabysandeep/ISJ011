package _8_oops.polymorphism;

public class Demo1 {
    public static void main(String[] args) {
        class Parent {
           final public int add(int number1, int number2) {
                return number1 + number2;
            }
        }

        class Child extends Parent {

            //method overloading
            public int add(int number1, int number2, int number3) {
                return number1 + number2 + number3;
            }
        }
        Child child = new Child();
        System.out.println(child.add(100,200));
        System.out.println(child.add(100,200,300));
        main("null");
    }

    public static void main(String args) {
        System.out.println("overloaded main method");
    }
}
