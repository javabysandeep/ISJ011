package _4_controlStatements.whileDemos;

public class Demo8 {
    public static void main(String[] args) {
        int number = 99999;//output - 45
        int sumOfDigits = 0;

        for (; number > 0; number = number / 10) {
            //  mod --> add -> divide
            int lastDigit = number % 10;
            sumOfDigits = sumOfDigits + lastDigit;
        }

        System.out.println("Sum of digits = " + sumOfDigits);

    }
}
