package _4_controlStatements.forDemos.nestedLoops;

public class Demo9Tables1To30 {
    public static void main(String[] args) {
        //horizontal tables
        for (int number = 1; number <= 30; number++) {
            for (int i = 1; i <= 10; i++) {
                System.out.print(number * i + " ");
            }
            System.out.println();
        }
    }
}
