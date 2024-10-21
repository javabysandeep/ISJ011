package _4_controlStatements.forDemos.nestedLoops;

public class Demo10Tables1To30 {
    public static void main(String[] args) {
        // vertical tables
        for (int row = 1; row <= 10; row++) {
            for (int column = 1; column <= 30; column++) {
                System.out.print(row * column + "\t");
            }
            System.out.println();
        }


    }
}
