package _4_controlStatements.jumpStatementDemos;

public class Demo1 {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);
            break;//eol
        }

        System.out.println("rest of the main");

        //output :1, rest of the main
    }
}
