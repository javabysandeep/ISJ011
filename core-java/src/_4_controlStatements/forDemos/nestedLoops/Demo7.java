package _4_controlStatements.forDemos.nestedLoops;

public class Demo7 {
    public static void main(String[] args) {
        /*

         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *

         * */
        for (int row = 6; row >= 1; row--) {
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
