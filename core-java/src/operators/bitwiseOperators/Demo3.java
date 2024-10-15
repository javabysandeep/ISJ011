package operators.bitwiseOperators;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println(10 % 2 == 2 && 10 / 0 == 0);//false
        System.out.println(10 % 2 == 2 & 10 / 0 == 0);//AE
    }
}
