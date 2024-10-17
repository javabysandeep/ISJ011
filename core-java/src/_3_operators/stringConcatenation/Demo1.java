package _3_operators.stringConcatenation;

public class Demo1 {
    public static void main(String[] args) {
        ///Left to right --->
        System.out.println(10 + 20 + "30" + 40);//303040
        System.out.println('A' + 'A' + 'A');//195
        System.out.println('A' + 'A' + "A");//130A
        System.out.println('A' + "A" + 'A');//AAA
        System.out.println("A" + 'A' + 'A');//AAA
        System.out.println(10 + 'A' + 20 + "A" + 'A' + 10 + 20);//95AA1020
        System.out.println('A' + 'A');//130
        System.out.println('A' + "A");//AA
        char ch = 'A' + 'A';
        System.out.println(ch);//symbol
        System.out.println((char) ('A' + 'A'));


    }
}
