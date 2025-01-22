package _11_array;

public class Demo19containsDigit {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'A', 'X', 'y','0'};
        boolean containsDigit = false;
        for (char ch : array) {
            if (ch >= '0' && ch <= '9') {
                containsDigit = true;
                break;
            }
        }
        System.out.println(containsDigit ? "contains digit" : "does not contain digit");
    }
}
