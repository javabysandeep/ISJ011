package _11_array;

public class Demo22ContainsChar {
    public static void main(String[] args) {
        char[] array = {'1', 'a', 'b', 'A', 'X', 'y', '0', '3'};
        char element = 'a';
        boolean found = false;
        for (char ch : array) {
            if (element == ch) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "found" : "not found");
    }
}
