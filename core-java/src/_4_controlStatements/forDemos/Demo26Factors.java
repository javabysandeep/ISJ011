package _4_controlStatements.forDemos;

public class Demo26Factors {
    public static void main(String[] args) {
        //find the factors of given number
        int number = 100;
        //6 ---> 1,2,3
        //28 --> 1, 2, 4, 7, 14
        //20 --> 1, 2, 4, 5, 10
        //1000 --> 500
        //10000 --> 5000
        for (int index = 1; index <= number / 2; index++) {
            if (number % index == 0) {
                System.out.println(index);
            }
        }
    }
}
