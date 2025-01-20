package _11_array;

public class Demo5AccessingArrayElements {
    public static void main(String[] args) {
        //printing array in a reverse order
        int[] array = {10, 11, 3, 4, 56, 9};
        for (int index = array.length - 1; index >= 0; index--) {
            System.out.print(array[index] + " ");
        }
        System.out.println("\n element at index 0 " + array[0]);
    }
}
