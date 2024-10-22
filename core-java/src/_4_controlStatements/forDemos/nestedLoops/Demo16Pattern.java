package _4_controlStatements.forDemos.nestedLoops;

public class Demo16Pattern {
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
        for (int row = 1; row <=5 ; row++) {
            //spaces
            for (int space = 5-row; space >0 ; space--) {
                System.out.print(" ");
            }
            //stars
            for (int star = 1; star <=row ; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //lower triangle
        for (int row = 4; row >=1 ; row--) {
            //spaces
            for (int space = 5-row; space >0 ; space--) {
                System.out.print(" ");
            }

            //stars
            for (int star = row; star >=1 ; star--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
