package _12_String_handling;

public class Demo2 {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");
        String s3 = new String("abc");
        String s4 = "abc";
        String s5 = "xyz";
        String s6 = new String("xyz");
        String s7 ="abc";
        System.out.println(s1 == s2);//false
        System.out.println(s2 == s3);//false
        System.out.println(s1 == s3);//false
        System.out.println(s1 == s4);//false
        System.out.println(s2 == s4);//false
        System.out.println(s3 == s4);//false
        System.out.println(s5 == s6);//false
        System.out.println(s4 == s7);//true

    }
}
