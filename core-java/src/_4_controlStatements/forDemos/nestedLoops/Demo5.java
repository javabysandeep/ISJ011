package _4_controlStatements.forDemos.nestedLoops;

public class Demo5 {
    public static void main(String[] args) {
        /*
         1
         2 2
         3 3 3
         4 4 4 4
         5 5 5 5 5
         6 6 6 6 6 6

         * */

        for (int row = 1; row <= 6; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }

    }
}
