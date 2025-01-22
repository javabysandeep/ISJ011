package _11_array;

public class Demo18ToLowerCase {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'A', 'X', 'y'};
        for (int index = 0; index < array.length; index++) {
            if (array[index] >= 'A' && array[index] <= 'Z') {
                array[index] = (char) (array[index] + 32);
            }
        }
        for (char ch:array){
            System.out.print(ch+" ");
        }
    }
}
