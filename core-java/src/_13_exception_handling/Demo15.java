package _13_exception_handling;

public class Demo15 {
    public static void main(String[] args) {
        System.out.println(division(100, 0)); //5
        System.out.println("rest of the main");
    }

    //exception handled in current method using try catch
    private static int division(int number1, int number2) {
        int quotient = 0;
        try {
            quotient = number1 / number2;
        } catch (ArithmeticException arithmeticException) {
            System.out.println("invalid denominator");
        }
        return quotient;
    }
}
