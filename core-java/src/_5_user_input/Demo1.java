package _5_user_input;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        // byte, short, int, long, float, double, char, boolean, String
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println("addition of two numbers is " + (number1 + number2));

    }
}
