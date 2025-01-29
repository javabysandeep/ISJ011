package _13_exception_handling;

public class Demo8 {
    public static void main(String[] args) {
        String str = "";
        try {
            System.out.println(str.charAt(0));
            System.out.println(10 / 0);
        } catch (ArithmeticException | IndexOutOfBoundsException exception) {
            System.out.println("exception occurred due to :" + exception.getMessage());
        }

        System.out.println("rest of the main");
        //output
        //string index out of bounds
        //rest of the main

    }
}
