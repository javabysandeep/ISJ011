package _11_array;

public class Demo14FindUniqueElement {
    public static void main(String[] args) {
        int[] array = {10, 11, 30, 55, 44, 11, 10, 30, 44};//55

        //n^2
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    break;
                }
            }
        }
        //n
    }
}
