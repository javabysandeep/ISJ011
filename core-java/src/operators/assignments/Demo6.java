package operators.assignments;

public class Demo6 {
    public static void main(String[] args) {
        int number = 456;
        int digit = number % 10;
        int sum = 0;
        System.out.println(digit);//6
        sum = sum + digit;
        System.out.println(number = number / 10);//45
        System.out.println(digit = number % 10);//5
        sum = sum + digit;
        System.out.println(number = number / 10);//4
        System.out.println(digit = number % 10);//4
        sum = sum + digit;
        System.out.println(number = number / 10);//0
        System.out.println("Sum of digits " + sum);//15

        int number1 = 12345678;
        int sumOfDigits = 0;
        while (number1 != 0) {
            int temp = number1 % 10;
            sumOfDigits = sumOfDigits + temp;
            number1 = number1 / 10;
        }
        System.out.println("using loop sum of digits " + sumOfDigits);


    }
}
