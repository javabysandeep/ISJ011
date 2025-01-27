package _12_String_handling;

public class Demo12SubStringTrim {
    public static void main(String[] args) {
        String str = "        good morning          ";
        str = str.trim();
        System.out.println(str);

        String substring = str.substring(4);
        System.out.println("substring ---> " + substring);

        String substring2 = str.substring(0, 4);
        System.out.println("substring ---> " + substring2);

    }
}
