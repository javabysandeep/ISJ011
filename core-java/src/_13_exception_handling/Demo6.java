package _13_exception_handling;

public class Demo6 {
    public static void main(String[] args) {
        String str = "";
        try {
            System.out.println(str.charAt(0));
            System.out.println(10 / 0);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("invalid denominator");
        }catch (IndexOutOfBoundsException indexOutOfBoundsException){
            System.out.println("string index out of bounds");
        }
        
        System.out.println("rest of the main");
        //output
        //string index out of bounds
        //rest of the main

    }
}
