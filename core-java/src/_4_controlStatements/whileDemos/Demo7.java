package _4_controlStatements.whileDemos;

public class Demo7 {
    public static void main(String[] args) {
        int number = 99999;//output - 45
        int sumOfDigits = 0;

        while (number > 0) {
            //  mod --> add -> divide
            int lastDigit = number % 10;
            sumOfDigits = sumOfDigits + lastDigit;
            number = number / 10;
        }

        System.out.println("Sum of digits = " + sumOfDigits);

    }
}
