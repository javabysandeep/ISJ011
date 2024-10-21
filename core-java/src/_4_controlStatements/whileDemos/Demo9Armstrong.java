package _4_controlStatements.whileDemos;

public class Demo9Armstrong {
    public static void main(String[] args) {
        int number = 153;
        //1^3 + 5^3 + 3^3 = 1 + 125 + 27 --> 153
        //Armstrong number = sum of cubes of digits is equal to given number
        int sumOfCubeDigits = 0;
        int originalNumber = number;
        while (number > 0) {
            int lastDigit = number % 10;
            sumOfCubeDigits = sumOfCubeDigits + lastDigit * lastDigit * lastDigit;
            number = number / 10;
        }
        System.out.println(sumOfCubeDigits == originalNumber ? "Armstrong" : "not an armstrong");
    }
}
