package _11_array;

import java.util.Arrays;

public class Demo13ShiftingOfElements {
    public static void main(String[] args) {
        //shift 1's to one side and o's to one side
        int[] array = {1, 1, 1, 0, 0, 1, 1};
        //{0, 1, 1, 0, 1, 1, 1}; //left=0, right=4
        //{0, 1, 1, 0, 1, 1, 1}; //left=1, right=3
        //{0, 0, 1, 1, 1, 1, 1}; //left=2, right=2

        //way 1: by using array
        //Arrays.sort(array);


        //way 2 : swapping
        for (int left = 0, right = array.length - 1; left < right; left++, right--) {
            while (array[left] == 0) {
                left++;
            }
            while (array[right] == 1) {
                right--;
            }
            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }


        for (int temp : array) {
            System.out.print(temp + " ");
        }


    }
}
