package _13_exception_handling;

public class Demo16 {
    public static void main(String[] args) {
        try {
            System.out.println(division(100, 0)); //5
        } catch (ArithmeticException arithmeticException) {
            System.out.println("invalid denominator");
            System.out.println("exception handled in method");
        }
        System.out.println("rest of the main");
    }

    //exception handled in the caller method
    private static int division(int number1, int number2) throws ArithmeticException {
        return number1 / number2;
    }
}
