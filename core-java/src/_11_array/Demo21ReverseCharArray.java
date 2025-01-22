package _11_array;

public class Demo21ReverseCharArray {
    public static void main(String[] args) {
        char[] array = {'1', 'a', 'b', 'A', 'X', 'y', '0', '3'};
        for (int left = 0, right = array.length - 1; left < right; left++, right--) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }
        for (char ch : array) {
            System.out.print(ch + " ");
        }
    }
}
