package operators.incrementDecrement;

public class Demo2 {
    public static void main(String[] args) {
        int a = 10;
        int b = a++; //b= 10, a = 11
        System.out.println(a);//11
        System.out.println(b);//10

        int c = 10;
        int d = c--; //d = 10, c=9
        System.out.println(c);//9
        System.out.println(d);//10

    }
}
