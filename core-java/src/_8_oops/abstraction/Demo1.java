package _8_oops.abstraction;

public class Demo1 {
    public static void main(String[] args) {
        class Concrete{
            void concreteMethod(){
                System.out.println("concrete method : with the body");
            }
        }
        Concrete concrete = new Concrete();
        concrete.concreteMethod();
    }
}
