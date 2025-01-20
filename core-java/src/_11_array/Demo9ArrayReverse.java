package _11_array;

public class Demo9ArrayReverse {
    public static void main(String[] args) {
        int[] array = {10, 11, 3, 4, 56, 9};

        System.out.println("wrong way 1 --> printing array only");
        for (int index = array.length - 1; index >= 0; index--) {
            System.out.print(array[index] + " ");
        }

        System.out.println("wrong way 2 --> creating new array ");
        int[] newArray = new int[array.length];
        for (int i = 0, j = array.length - 1; i < array.length && j >= 0; i++, j--) {
            newArray[i] = array[j];
        }
        for (int temp : newArray) {
            System.out.print(temp + " ");
        }

        System.out.println("correct way");
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        System.out.println("reversed array");
        for (int temp : array) {
            System.out.print(temp + " ");
        }
    }
}
