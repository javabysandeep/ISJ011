package operators.shortHandArithmetic;

public class Demo1 {
    public static void main(String[] args) {
        int a = 10;
        //a = a + 20;
        a += 20; // a = a + 20
        System.out.println(a);//30

        int b = 20;
        //b = b - 10;
        b -= 10; // b = b -10;
        System.out.println(b);//10

        int c = 30;
//        c = c * 3;
        c *= 3;  //c = c * 3
        System.out.println(c);//90

        int d = 100;
        //d = d / 5;
        d /= 5; //d = d / 5;
        System.out.println(d);//20

        int e = 100;
        // e = e % 3;
        e %= 3; //e = e % 3;
        System.out.println(e);//1

        int f = 100;
        f *= f * 2; //  f *=200 --> f = f * 200; // 100 * 200 = 20,000
        System.out.println(f);//20000

        int x = 11;
        x %= x * 10; // x %=110 --> x = x %110 --> x = 11%110 -->
        System.out.println(x);//11

        // 11 % 12 --> 11

        // 12 % 11 --> 1
        int y = 19;
        y *= y % 3 * 2;
        //1* 2 =2
        //y = y * 2; --> 38
        System.out.println(y);//38
        //19 - shubham, rishi, kunal, hrishieksh
        //38 - abhishek, sharad, prakash
        //

    }
}
