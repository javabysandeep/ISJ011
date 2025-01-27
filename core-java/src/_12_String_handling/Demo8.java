package _12_String_handling;

public class Demo8 {
    public static void main(String[] args) {
        String str = "good morning";

        //length
        System.out.println("no. of characters "+str.length());

        //replace
        str = str.replace('o','@');
        System.out.println(str);
    }
}
