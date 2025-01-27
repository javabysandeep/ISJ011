package _12_String_handling;

public class Demo14Reverse {
    public static void main(String[] args) {
        String str = "kunal,vinit,suyog,kajal,shivani";
        //str.reverse();
        String reverse = "";


        //please avoid
        for (int index = str.length() - 1; index >= 0; index--) {
            //expensive
            reverse = reverse + str.charAt(index);
        }
        System.out.println(reverse);

    }
}
