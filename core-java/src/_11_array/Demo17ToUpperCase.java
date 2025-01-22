package _11_array;

public class Demo17ToUpperCase {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'A', 'X', 'y'};
        for (int index = 0; index < array.length; index++) {
            if (array[index] >= 'a' && array[index] <= 'z') {
                array[index] = (char) (array[index] - 32);
            }
        }
        System.out.println((int) 'A');//65
        System.out.println((int) 'a');//97
        for (char ch:array){
            System.out.print(ch+" ");
        }
    }
}
