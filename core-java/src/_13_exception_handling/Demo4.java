package _13_exception_handling;

public class Demo4 {
    public static void main(String[] args) {

        try {
            System.out.println(10 / 0);
            System.out.println("try rest of the statement");
        } finally {
            System.out.println("finally block");
        }
        System.out.println("rest of the main");//this won't be executed

        //output:
        //finally block
        //ArithmeticException
    }
}
