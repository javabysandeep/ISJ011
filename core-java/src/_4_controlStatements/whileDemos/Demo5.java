package _4_controlStatements.whileDemos;

public class Demo5 {
    public static void main(String[] args) {
        int left = 0;
        int right = 10;
        while (left < right) {
            System.out.println(left + "\t" + right);
            left++;
            right--;
        }
        //output
        // 0 10
        // 1 9
        // 2 8
        // 3 7
        // 4 6
    }
}
