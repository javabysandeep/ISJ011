package _11_array;

public class Demo12SumOfArrayElements {
    public static void main(String[] args) {
        int[] array = {10, 20, 44, 60, 53, 9};
        int sum = 0;
        for (int temp : array) {
            sum += temp;
        }
        System.out.println("Sum of array elements is " + sum);
    }
}
