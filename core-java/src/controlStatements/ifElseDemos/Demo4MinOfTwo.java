package controlStatements.ifElseDemos;

public class Demo4MinOfTwo {
    public static void main(String[] args) {
        int number1 = 11;
        int number2 = 10;

        if (number1 < number2) {
            System.out.println(number1 + " is min");
        }
        if (number2 < number1) {
            System.out.println(number2 + " is min");
        }
    }
}
