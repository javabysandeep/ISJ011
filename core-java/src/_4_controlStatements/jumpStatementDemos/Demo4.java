package _4_controlStatements.jumpStatementDemos;

public class Demo4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("rest of the main");
        //output : 1 to 20 and rest of the main
    }
}
