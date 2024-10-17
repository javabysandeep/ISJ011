package _4_controlStatements.forDemos;

public class Demo20 {
    public static void main(String[] args) {
        //print the even numbers in a range
        int start = 1;
        int end = 10;

        for (int i = start; i <= end && i % 2 == 0; i++) {
            System.out.println(i);
            i++;
        }
        // no. of iterations are double
    }
}
