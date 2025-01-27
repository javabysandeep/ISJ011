package _12_String_handling;

public class Demo21 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("abc");
        StringBuilder sb2 = new StringBuilder("abc");
        System.out.println(sb1.equals(sb2));//false
    }
}
