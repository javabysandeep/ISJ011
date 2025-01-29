package _13_exception_handling;

public class Demo13 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException arithmeticException) {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println("exception handler");
        } finally {
            System.out.println("finally block");
        }
        System.out.println("rest of the main");//won't be executed

        //output
        //finally block
        //AE
    }
}
