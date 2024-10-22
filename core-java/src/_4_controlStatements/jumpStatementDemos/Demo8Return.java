package _4_controlStatements.jumpStatementDemos;

public class Demo8Return {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                return;
            }
            System.out.println(i);
        }
        System.out.println("rest of the main");
        System.out.println("rest of the main");
        System.out.println("rest of the main");
        System.out.println("rest of the main");
        System.out.println("rest of the main");
        System.out.println("rest of the main");

        //output : 1, 2
    }
}
