package _3_operators.conditionalOperator;

public class Demo3LeapYear {
    public static void main(String[] args) {
        int year = 2024;
        //leap year :
        //1. year must be divisible by 4
        //2. if year is century then it must be divisible by 400
        boolean isLeapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        System.out.println(
                isLeapYear
                        ? "its a leap year"
                        : "its not a leap year"

        );
    }
}
