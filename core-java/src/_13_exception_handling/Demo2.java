package _13_exception_handling;

public class Demo2 {
    public static void main(String[] args) {
        //throw new ArithmeticException("/ by zero");
        System.out.println(10 / 0);
        System.out.println("rest of the main");
    }

    public static void readFile(String filePath){
        //logic to read the file
    }
}
