package _5_user_input;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character value");
        char ch = scanner.next().charAt(0);
        System.out.println("you have entered " + ch);
    }
}
