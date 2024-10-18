package _4_controlStatements.forDemos.nestedLoops;

public class Demo8 {
    public static void main(String[] args) {
        /*

                *
               **
              ***
             ****
            *****
           ******

         * */

        for (int row = 1; row <=6 ; row++) {

            for (int space = 6-row; space >0 ; space--) {
                System.out.print(" ");
            }
            
            for (int star = 1; star <=row ; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
