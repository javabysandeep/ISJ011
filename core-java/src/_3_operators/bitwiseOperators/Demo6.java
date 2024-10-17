package _3_operators.bitwiseOperators;

public class Demo6 {
    public static void main(String[] args) {
        System.out.println(256 >> 1);//128
        System.out.println(256 >> 2);//64
        System.out.println(256 >> 3);//32
        System.out.println(256 >> 4);//16
        System.out.println(256 >> 5);//8
        System.out.println(256 >> 6);//4
        System.out.println(256 >> 7);//2
        System.out.println(256 >> 8);//1
        System.out.println(256 >> 9);//0
        System.out.println(256 >> 10);//0
        System.out.println(256 >> 11);//0

        //formulae : operand1 / 2^operand2
        //e.g. 256 / 2^1 --> 128
        //e.g. 256 / 2^2 --> 64
        //e.g. 256 / 2^3 --> 32
        //e.g. 256 / 2^4 --> 15
        //e.g. 256 / 2^5 --> 8
    }
}
