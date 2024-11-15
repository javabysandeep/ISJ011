package _7_class_components.methods;

public class AdditionDemo {

    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 200;
        System.out.println(add(number1, number2)); // 1. 3000
        System.out.println(number1 + "\t" + number2); //2. 100  200
    }

    public static int add(int number1, int number2) {
        number1 = 1000;
        number2 = 2000;
        System.out.println(number1 + "\t" + number2); //3. 1000     2000
        return number1 + number2;
    }
}
