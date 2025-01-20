package _11_array;

public class Demo4AccessingArrayElements {
    public static void main(String[] args) {
        int[] array = {10, 11, 3, 4, 56, 9};
        //1. one by one
        System.out.println("one by one");
        System.out.println(array[0]);//10
        System.out.println(array[1]);//11
        System.out.println(array[2]);//3
        System.out.println(array[3]);//4
        System.out.println(array[4]);//56
        System.out.println(array[5]);//9
        // System.out.println(array[6]);//AIOBE

        System.out.println("2. using for loop");
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }

        System.out.println("3. enhanced for loop");
        for (int temp : array) {
            System.out.println(temp);
        }
    }
}
