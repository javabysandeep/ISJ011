package operators.bitwiseOperators;

public class Demo4 {
    public static void main(String[] args) {
        System.out.println(10 % 2 == 0 || 10 / 0 == 0);//true
        System.out.println(10 % 2 == 0 | 10 / 0 == 0);//AE
    }
}