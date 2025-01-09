package _10_final_keyword;

public class Demo2 {
    final int x = 100;
    final int y = 200;
    final static int z = 300;

    public static void main(String[] args) {
        final int a = 100;
        //a = 200; //CTE -> final variable value cannot be reassigned
        System.out.println(a);
    }
}
