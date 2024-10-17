package _3_operators.arithmetic;

public class Demo6 {
    public static void main(String[] args) {
        System.out.println(2 % 5 + 3 + 4 * 5); //2+3+4*5 --> 2+3+20 =25
        System.out.println(2 % (5 + 3) + 4 * 5); //22
        //System.out.println(true + true);//CTE
        System.out.println(9 / 0.3);//30.0
        System.out.println(9.0 / 3);//3.0
        System.out.println(9.0 % 3);//0.0
    }
}
