package _4_controlStatements.forDemos;

public class Demo13 {
    public static void main(String[] args) {
        for (int left = 0, right = 10; left < right; left--, right--) {
            System.out.println(left + "\t" + right);
        }
    }
    //output : loop will run infinite times
    //0 10
    //-1 9
    //-2 8
    //. ...
}
