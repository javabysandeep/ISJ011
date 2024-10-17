package _3_operators.assignments;

public class Demo11DivisibleBy2And3 {
    public static void main(String[] args) {
        int number = 120;
        System.out.println(
                number % 2 == 0 && number % 3 == 0 ?
                "divisible by both 2 & 3"
                : "not divisible by both 2 & 3");

    }
}
