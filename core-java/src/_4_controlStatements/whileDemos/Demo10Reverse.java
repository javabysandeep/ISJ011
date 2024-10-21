package _4_controlStatements.whileDemos;

public class Demo10Reverse {
    public static void main(String[] args) {
        int number = 211024;
        //output  : 420112
        int reverse = 0;
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        System.out.println("Reverse number is " + reverse);
    }
}
