package _5_user_input;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;
        do {
            System.out.println("Enter a character");
            ch = scanner.next().charAt(0);
            System.out.println("you have entered " + ch);
        } while (ch != 'x');
    }
}
