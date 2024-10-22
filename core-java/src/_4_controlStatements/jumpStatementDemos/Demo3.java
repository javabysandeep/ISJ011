package _4_controlStatements.jumpStatementDemos;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println("rest of the main");
//        break;//CTE - break cannot be outside switch or loop
        switch (3) {
            case 1:
                System.out.println("one");
               // break;
            case 2:
                System.out.println("two");
                //break;
            case 3:
                System.out.println("three");
                //break;
            case 4:
                System.out.println("four");
                break;
            default:
                System.out.println("invalid number");
                break;
        }
    }
}
