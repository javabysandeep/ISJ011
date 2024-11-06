package _5_user_input;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a boolean value");
        boolean value = scanner.nextBoolean();
        System.out.println("you have entered " + value);
    }
}
