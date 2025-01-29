package _13_exception_handling;

public class Demo7 {
    public static void main(String[] args) {
        String str = "";
        try {
            System.out.println(str.charAt(0));
            System.out.println(10 / 0);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("invalid denominator");
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            System.out.println("invalid index");
        } catch (Exception exception) {
            System.out.println("generic exception handler " + exception);
        }

        System.out.println("rest of the main");
        //output
        //string index out of bounds
        //rest of the main

    }
}
