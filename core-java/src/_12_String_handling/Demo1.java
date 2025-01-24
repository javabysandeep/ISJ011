package _12_String_handling;

public class Demo1 {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");
        String s3 = new String("abc");
        System.out.println("hashcode method overridden and generated on content");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println("hashcode based on memory address");
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        String s4 = "abc";
        String s5 = "xyz";
        String s6 = new String("xyz");


    }
}
