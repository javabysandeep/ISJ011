package _4_controlStatements.forDemos.nestedLoops;

public class Demo2 {
    public static void main(String[] args) {
        /*
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *

         * */
        for (int row = 1; row <= 5; row++) {

            for (int column = 1; column <= 5; column++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
