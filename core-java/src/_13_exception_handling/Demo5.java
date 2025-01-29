package _13_exception_handling;

public class Demo5 {
    public static void main(String[] args) {
        String str = "";
        try {
            System.out.println(str.charAt(0));
            System.out.println(10 / 0);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("invalid denominator");
        }

        System.out.println("rest of the main");
        //output
        //String IndexOufOfBoundException

    }
}
