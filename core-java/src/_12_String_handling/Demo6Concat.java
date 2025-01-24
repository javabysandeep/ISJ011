package _12_String_handling;

public class Demo6Concat {
    public static void main(String[] args) {
        String s1 = "abc";
        s1.concat(" xyz");
        System.out.println(s1);//abc

        String s2 = "abc";
        s2 = s2.concat(" xyz");
        System.out.println(s2);//abc xyz

    }
}
