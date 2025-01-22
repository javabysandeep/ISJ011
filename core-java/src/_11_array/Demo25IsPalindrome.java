package _11_array;

public class Demo25IsPalindrome {
    public static void main(String[] args) {
        char[] array = {'1', '2', '3', '2', '1'};
        boolean isPalindrome = true;
        for (int left = 0, right = array.length - 1; left < right; left++, right--) {
            if (array[left] != array[right]) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome ? "its a palindrome" : "not a palindrome");
    }
}
