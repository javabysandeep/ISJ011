package _12_String_handling;

public class Demo5ToString {
    public static void main(String[] args) {
        //toString method is overridden, it prints the content of the String
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1.toString());
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s2.toString());
    }
}
