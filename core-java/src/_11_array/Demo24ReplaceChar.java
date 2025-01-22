package _11_array;

public class Demo24ReplaceChar {
    public static void main(String[] args) {
        char[] array = {'1', 'a', 'b', 'A', 'X', 'y', 'a', 'a'};
        char oldChar = 'a';
        char newChar = '@';
        for (int index = 0; index < array.length; index++) {
            if (array[index] == oldChar) {
                array[index] = newChar;
            }
        }
        for (char ch : array) {
            System.out.print(ch + " ");
        }
    }
}
