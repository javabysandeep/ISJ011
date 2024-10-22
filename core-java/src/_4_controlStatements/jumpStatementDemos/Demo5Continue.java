package _4_controlStatements.jumpStatementDemos;

public class Demo5Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("rest of the main");
        //continue;//CTE
        //output : 1 to 100 except 21, 42, 63, 84

    }
}
