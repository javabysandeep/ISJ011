package _12_String_handling;

public class Demo15Reverse {
    public static void main(String[] args) {
        String str = "kunal,vinit,suyog,kajal,shivani";

        //way 2 : this is wrong
        for (int index = str.length() - 1; index >= 0; index--) {
            System.out.print(str.charAt(index));
        }

    }
}
