package _11_array;

public class Demo3 {
    public static void main(String[] args) {

        //RuntimeException --> NegativeArraySizeException
        //int[] array = new int[-5];

        int[] array = new int[0];
        System.out.println("array length " + array.length);//0

        // int[] array2 = new int[1.0F];//CTE
        //int[] array3 = new int[100L];//CTE

    }
}
