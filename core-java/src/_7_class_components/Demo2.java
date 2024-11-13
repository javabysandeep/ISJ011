package _7_class_components;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("main method");
        System.out.println(Demo2.add(100, 200));
        System.out.println(add(100, 200));
    }

    public static int add(int number1, int number2) {
        return number1 + number2;
    }
}
