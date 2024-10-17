package _4_controlStatements.forDemos;

public class Demo18 {
    public static void main(String[] args) {
        //print the even numbers in a range
        int start = 1;
        int end = 10;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        // no. of iterations are double
    }
}
