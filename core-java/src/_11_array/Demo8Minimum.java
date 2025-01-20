package _11_array;

public class Demo8Minimum {
    public static void main(String[] args) {
        int[] array = {10, 11, 3, 4, 56, 9};
        int minValue = Integer.MAX_VALUE;
        for (int temp : array) {
            if (temp < minValue){
                minValue = temp;
            }
        }
        System.out.println("minimum element in the given array is "+minValue);
    }
}
