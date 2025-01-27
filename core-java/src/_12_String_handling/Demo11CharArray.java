package _12_String_handling;

public class Demo11CharArray {
    public static void main(String[] args) {
        String str = "good morning";
        char[] charArray = str.toCharArray();
        for (char ch : charArray) {
            System.out.println(ch);
        }

        System.out.println("char at index "+str.charAt(0));
    }
}
