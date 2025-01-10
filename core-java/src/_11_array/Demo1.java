package _11_array;

public class Demo1 {
    public static void main(String[] args) {
        int a1 = 10;
        int a2 = 10;
        int a3 = 10;
        int a4 = 10;
        int a5 = 10;
        int a6 = 10;
        //.....

        //case 1: we know the values to be stored
        int[] integerValues = {10, 34, 23, 45, 56, 234};
        //RHS = object
        //integerValues = reference variable
        System.out.println(integerValues);
        System.out.println(integerValues.hashCode());

        // case 2 : we don't know the values to be stored
        int[] integerValues2 = new int[10];
        // array will be initialized with default values.
        System.out.println("size of an array "+integerValues2.length);
    }
}
