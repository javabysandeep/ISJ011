package _4_controlStatements.jumpStatementDemos;

public class Demo6Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("rest of the main");
        //output : all the numbers which are multiple of three

    }
}
