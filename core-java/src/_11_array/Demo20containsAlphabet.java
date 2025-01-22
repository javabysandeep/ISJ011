package _11_array;

public class Demo20containsAlphabet {
    public static void main(String[] args) {
        char[] array = {'1', 'a', 'b', 'A', 'X', 'y', '0', '1'};
        boolean containsAlphabets = false;
        for (char ch : array) {
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                containsAlphabets = true;
                break;
            }
        }
        System.out.println(containsAlphabets ? "contains alphabets" : "does not contain alphabets");
    }
}
