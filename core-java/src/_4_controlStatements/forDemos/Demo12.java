package _4_controlStatements.forDemos;

public class Demo12 {
    public static void main(String[] args) {
        for (int left = 0, right = 10; left < right; left++, right++) {
            System.out.println(left + "\t" + right);
        }
    }
    //output : loop will run infinite times
    //0 10
    //1 11
    //2 12
    //3 13
    //4 14
    //. ...
}
