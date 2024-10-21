package _4_controlStatements.forDemos.nestedLoops;

public class Demo14 {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(row == column ? "1 " : "0 ");
            }
            System.out.println();
        }
    }
}
