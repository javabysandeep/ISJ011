package operators.incrementDecrement;

public class Demo4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        System.out.println(a++ - ++b + ++a - b++ + --c + d++);//
        System.out.println("a \t" + a);//3
        System.out.println("b \t" + b);//4
        System.out.println("c \t" + c);//2
        System.out.println("d \t" + d);//5

    }
}
