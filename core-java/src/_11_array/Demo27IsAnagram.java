package _11_array;

import java.util.Arrays;

public class Demo27IsAnagram {
    public static void main(String[] args) {
        char[] array1 = {'a', 'a', 'c'};
        char[] array2 = {'a', 'c', 't'};
        Arrays.sort(array1);//aac
        Arrays.sort(array2);//act
        System.out.println(Arrays.equals(array1, array2) ? "anagram" : "not a anagram");
    }
}
