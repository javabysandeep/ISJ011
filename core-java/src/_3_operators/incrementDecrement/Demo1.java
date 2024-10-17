package _3_operators.incrementDecrement;

public class Demo1 {
    public static void main(String[] args) {
        //System.out.println(20++);//++, -- will work on variables
        //System.out.println(true++);// ++, -- won't work on boolean
        int a = 10;
        int b = ++a; // a = 11, b=11
        System.out.println(a);//11
        System.out.println(b);//11

        int c = 10;
        int d = --c; // c= 9, d= 9
        System.out.println(c);//9
        System.out.println(d);//9

    }
}
