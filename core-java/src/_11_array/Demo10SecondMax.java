package _11_array;

public class Demo10SecondMax {
    public static void main(String[] args) {
        int[] array = {10, 20, 44, 60, 53, 9};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int index = 0; index < array.length; index++) {
            if (array[index] > max) {
                secondMax = max;
                max = array[index];
            }
            if (array[index] > secondMax && array[index] < max) {
                secondMax = array[index];
            }
        }
        System.out.println("Max value is " + max);
        System.out.println("Second Max value is " + secondMax);

    }
}
