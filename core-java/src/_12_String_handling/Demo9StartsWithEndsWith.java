package _12_String_handling;

public class Demo9StartsWithEndsWith {
    public static void main(String[] args) {
        String str = "good morning";

        System.out.println(str.startsWith("g"));//true

        System.out.println(str.startsWith("&&&"));//false

        System.out.println(str.endsWith("g"));//true

        System.out.println(str.endsWith("&&&"));//false



    }
}
