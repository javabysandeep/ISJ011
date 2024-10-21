package _4_controlStatements.forDemos.nestedLoops;

public class Demo11Pattern {
    public static void main(String[] args) {
        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *

         * */

        //upper triangle
        for (int row = 1; row <= 5; row++) {
            //spaces
            for (int space = 5 - row; space > 0; space--) {
                System.out.print(" ");
            }

            //stars
            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //lower triangle
        for (int row = 4; row >= 1; row--) {
            //space
            for (int space = 0; space <= 4 - row; space++) {
                System.out.print(" ");
            }
            //stars
            for (int star = row; star >= 1; star--) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
