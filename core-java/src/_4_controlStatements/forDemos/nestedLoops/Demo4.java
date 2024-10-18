package _4_controlStatements.forDemos.nestedLoops;

public class Demo4 {
    public static void main(String[] args) {
        /*
         1
         1 2
         1 2 3
         1 2 3 4
         1 2 3 4 5
         1 2 3 4 5 6

         * */

        for (int row = 1; row <= 6; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

    }
}
