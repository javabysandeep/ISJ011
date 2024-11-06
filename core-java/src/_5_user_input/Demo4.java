package _5_user_input;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String value");

        //String str = scanner.next();
        String str = scanner.nextLine();

        System.out.println("you have entered " + str);
    }
}
