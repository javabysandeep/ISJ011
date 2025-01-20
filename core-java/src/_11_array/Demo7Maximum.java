package _11_array;

public class Demo7Maximum {
    public static void main(String[] args) {
        int[] array = {10, 11, 3, 4, 56, 9};
        int maximum = Integer.MIN_VALUE;
        for (int temp : array) {
            if (temp > maximum){
                maximum = temp;
            }
        }
        System.out.println("maximum element in the given "+maximum);
    }
}
