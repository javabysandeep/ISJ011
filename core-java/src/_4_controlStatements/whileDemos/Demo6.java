package _4_controlStatements.whileDemos;

public class Demo6 {
    public static void main(String[] args) {
        int number = 153;//output - 9
        int sumOfDigits = 0;

        int lastDigit = number % 10; //3
        sumOfDigits = sumOfDigits + lastDigit;
        number = number / 10; //153/10 --> 15

        lastDigit = number % 10;//--> 5
        sumOfDigits = sumOfDigits + lastDigit;
        number = number / 10; //15/10 --> 1

        lastDigit = number % 10; //1%10 --> 1
        sumOfDigits = sumOfDigits + lastDigit;
        number = number / 10; // 1/10 --> 0

        System.out.println("Sum of digits = " + sumOfDigits);


    }
}
