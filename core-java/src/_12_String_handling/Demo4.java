package _12_String_handling;

public class Demo4 {
    public static void main(String[] args) {
       String x1 = "A";
       String x2 = "B";
       String x3 = "C";
       String x4 = "C";

        System.out.println("4. comparison using compareTo) method");
        System.out.println(x1.compareTo(x2));//-1 ---> 65-66
        System.out.println(x1.compareTo(x3));//-2 ---> 65-67
        System.out.println(x2.compareTo(x3));//-1 --> 66-67
        System.out.println(x3.compareTo(x4));//0 --> 67-67

    }
}
