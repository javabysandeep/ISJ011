package _3_operators.logicalOperators;

public class Demo2 {
    public static void main(String[] args) {
        int year = 2024;

        //leap year: year must be divisible by 4 and if it is century then it must be divisible by 400
        System.out.println(year % 400 == 0 || year % 4 == 0 && year % 100 != 0);//true
    }
}
