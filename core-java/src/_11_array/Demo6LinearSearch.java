package _11_array;

public class Demo6LinearSearch {
    public static void main(String[] args) {
        int[] array = {10, 11, 3, 4, 56, 9};
        int element = 11;
        boolean ifFound = false;
        for (int index = 0; index < array.length; index++) {
            if (element == array[index]) {
                ifFound = true;
                break;
            }
        }
        System.out.println(ifFound ? "element found" : "not found");
    }
}
