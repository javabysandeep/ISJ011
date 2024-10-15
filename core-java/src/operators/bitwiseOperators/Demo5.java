package operators.bitwiseOperators;

public class Demo5 {
    public static void main(String[] args) {
        System.out.println(4 << 1);//8
        System.out.println(4 << 2);//16
        System.out.println(4 << 3);//32
        System.out.println(4 << 4);//64
        System.out.println(4 << 5);//128

        //formulae : operand1 * 2^operand2
        //e.g. 4 * 2^1 --> 8
        //e.g. 4 * 2^2 --> 16
        //e.g. 4 * 2^3 --> 32
        //e.g. 4 * 2^4 --> 64
        //e.g. 4 * 2^5 --> 128
    }
}
