package _13_exception_handling;

import java.util.Scanner;

public class Demo19 {
    public static void main(String[] args) {
        vote();
    }

    private static void vote() {
        //voters
        System.out.println("Enter your age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 18) {
            //created an exception
            try {
                throw new InvalidAgeException("Invalid age");
            } catch (InvalidAgeException e) {
                System.out.println("invalid age issue");
            }
        } else {
            System.out.println("You are allowed to vote.");
        }
    }
}
