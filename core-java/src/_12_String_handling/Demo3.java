package _12_String_handling;

public class Demo3 {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "abc";
        String s3 = "abc";
        System.out.println("1. comparison using == operator");
        System.out.println(s1 == s2);//false
        System.out.println(s1 == s3);//false
        System.out.println(s2 == s3);//true

        System.out.println("2. comparison using equals() method");
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s2.equals(s3));//true

        String x1 = "ABC";
        String x2 = "abc";
        String x3 = "Abc";

        System.out.println("3. comparison using equalsIgnoreCase() method");
        System.out.println(x1.equalsIgnoreCase(x2));//true
        System.out.println(x1.equalsIgnoreCase(x3));//true
        System.out.println(x2.equalsIgnoreCase(x3));//true

    }
}
