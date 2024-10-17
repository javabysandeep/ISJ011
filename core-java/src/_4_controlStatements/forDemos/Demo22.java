package _4_controlStatements.forDemos;

public class Demo22 {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 15;
        // do division without using / operator
        //100 -20 = 80
        //80 -20 = 60
        //60 -20 = 40
        //40 -20 = 20
        //20 -20 = 0
        int quotient = 0;
        for (; number1 >= number2; ) {
            number1 = number1 - number2;
            quotient++;
        }
        System.out.println("Quotient is " + quotient);
        System.out.println("Remainder is " + number1);
    }
}
