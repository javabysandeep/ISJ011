package _3_operators.relational;

public class Demo2 {
    public static void main(String[] args) {
//        System.out.println(10 >=true);//CTE
        //System.out.println(10 !=true);//CTE--> both operand must be of same type
        System.out.println(false != true);//true
        System.out.println(10 % 2 == 0);//true
        System.out.println(2024 % 400 == 0);//false
        System.out.println(2024 % 100 != 0);//true
        System.out.println(2024 % 4 == 0);//true

        System.out.println(99 % 7 == 0);//false
    }
}
