package _13_exception_handling;

public class Demo10 {
    public static void main(String[] args) {
        //nesting of try catch
        try {
            try {
                System.out.println(10 / 0);
            } catch (ArithmeticException ae) {
                System.out.println("inner catch");
            }
            System.out.println("outer try");
        } catch (ArithmeticException ae) {
            System.out.println("outer catch");
        }
        System.out.println("Rest of the main");

        //output
        //inner catch
        //outer try
        //rest of the main
    }
}
