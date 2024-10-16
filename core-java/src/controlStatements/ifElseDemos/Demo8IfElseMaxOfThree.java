package controlStatements.ifElseDemos;

public class Demo8IfElseMaxOfThree {
    public static void main(String[] args) {
        int number1 = 110;
        int number2 = 10;
        int number3 = 100;

        if (number1 > number2 && number1 > number3) {
            System.out.println(number1 + " is max");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number2 + " is max");
        } else {
            System.out.println(number3 + " is max");
        }
    }
}
