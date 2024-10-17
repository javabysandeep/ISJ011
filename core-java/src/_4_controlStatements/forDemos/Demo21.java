package _4_controlStatements.forDemos;

public class Demo21 {
    public static void main(String[] args) {
        int number1 = 15;
        int number2 = 10;
        //System.out.println(number1 * number2);
        // do multiplication without using * operator
        //15 + 15+ 15 + 15 +15 + 15 +15 + 15+ 15 + 15 = 150
        // 10 + 10 + 10 + 10 + 10 + 10 + 10 + 10 + 10 + 10 + 10 + 10 + 10 + 10 + 10 = 150
        int product = 0;
        for (int i = 1; i <= number2; i++) {
            product = product + number1;
        }
        System.out.println("multiplication of " + number1 + " and " + number2 + " is " + product);
    }
}
