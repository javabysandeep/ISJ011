package _4_controlStatements.whileDemos;

public class Demo11Palindrome {
    public static void main(String[] args) {
        int number = 12321;
        //palindrome : given number = reverse of it
        int originalNumber = number;
        int reverse = 0;
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        System.out.println("Reverse number is " + reverse);
        System.out.println(reverse == originalNumber ? "palindrome" : "not a palindrome");
    }
}
