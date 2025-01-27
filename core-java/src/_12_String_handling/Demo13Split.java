package _12_String_handling;

public class Demo13Split {
    public static void main(String[] args) {
        String str = "kunal,vinit,suyog,kajal,shivani";
        //delimiter
        String[] StringsArray = str.split(",");
        for (String temp : StringsArray) {
            System.out.println(temp);
        }
    }
}
