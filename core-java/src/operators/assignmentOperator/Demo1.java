package operators.assignmentOperator;

public class Demo1 {
    public static void main(String[] args) {
        int a = 10;//direct value
        int b = 10 * 20;//expression
        int c = b; //variable
        int d = add(10, 20);
        System.out.println(a);//10
        System.out.println(b);//200
        System.out.println(c);//200
        System.out.println(d);//30
        // System.out.println(10=10);//CTE--> LHS must be a variable
        System.out.println(a = 100);//100
    }

    private static int add(int number1, int number2) {
        return number1 + number2;
    }
}
