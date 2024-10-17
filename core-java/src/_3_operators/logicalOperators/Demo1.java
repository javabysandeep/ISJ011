package _3_operators.logicalOperators;

public class Demo1 {
    public static void main(String[] args) {
        //logical short circuit
        System.out.println((10 % 2 != 0) && (10 / 0 == 0));//false
        System.out.println((10 % 2 == 0) || (10 / 0 == 0));//true

        //bitwise
        System.out.println((10 % 2 != 0) & (10 / 0 == 0));//AE
        System.out.println((10 % 2 == 0) | (10 / 0 == 0));//AE
    }
}
