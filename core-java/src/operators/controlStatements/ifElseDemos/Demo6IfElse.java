package operators.controlStatements.ifElseDemos;

public class Demo6IfElse {
    public static void main(String[] args) {
        int number = 11;
        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        }
        //System.out.println("independent statements are not allowed in between if and else");//CTE
        else {
            System.out.println(number + " is an odd number");
        }
    }
}
