package _13_exception_handling;

public class Demo9 {
    public static void main(String[] args) {
        //order of catch blocks must be child to parent otherwise CTE
        String str = "";
        try {
            System.out.println(str.charAt(0));
            System.out.println(10 / 0);
        } catch (Throwable exception) {
            System.out.println("generic exception handler " + exception);
        }
        /*catch (ArithmeticException arithmeticException) {
            System.out.println("invalid denominator");
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            System.out.println("invalid index");
        }*/

        System.out.println("rest of the main");
        //output
        //string index out of bounds
        //rest of the main

    }
}
