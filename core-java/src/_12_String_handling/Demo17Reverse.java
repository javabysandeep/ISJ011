package _12_String_handling;

public class Demo17Reverse {
    public static void main(String[] args) {
        String str = "kunal,vinit,suyog,kajal,shivani";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
    }
}
