package _6_class_object.demos;

public class Demo3 {
    int a = 1;
    int b = 2;
    static int c = 3;

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println("local variable a : " + a);//10
        System.out.println("local variable b : " + b);//20
        System.out.println("local variable c : " + c);//30
        System.out.println("static variable c: " + Demo3.c);//3

        Demo3 ref = new Demo3();
        System.out.println("instance variable a : " + ref.a);//1
        System.out.println("instance variable b : " + ref.b);//2
    }
}
