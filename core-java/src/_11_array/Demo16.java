package _11_array;

public class Demo16 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2},
                {3, 4, 5},
                {6, 7, 8, 9},
        };
        System.out.println(array.length);//3
        System.out.println(array[0].length);//2
        System.out.println(array[1].length);//3
        System.out.println(array[2].length);//4

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();

        }
    }
}
