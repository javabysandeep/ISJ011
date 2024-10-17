package _4_controlStatements.forDemos;

public class Demo19 {
    public static void main(String[] args) {
        //print the even numbers in a range
        int start = 1;
        int end = 10;
        int i = start % 2 == 0 ? start : start + 1;
        for (; i <= end; i = i + 2) {
            System.out.println(i);
        }
        // no. of iterations are double
    }
}


