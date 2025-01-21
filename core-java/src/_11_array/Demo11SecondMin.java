package _11_array;

public class Demo11SecondMin {
    public static void main(String[] args) {
        int[] array = {10, 20, 44, 60, 53, 9};
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int index = 0; index < array.length; index++) {
            if (array[index] < min) {
                secondMin = min;
                min = array[index];
            }
            if (array[index] < secondMin && array[index] > min) {
                secondMin = array[index];
            }
        }
        System.out.println("Min value is " + min);
        System.out.println("Second Min value is " + secondMin);

    }
}
