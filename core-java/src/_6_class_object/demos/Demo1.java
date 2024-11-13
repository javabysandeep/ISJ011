package _6_class_object.demos;

public class Demo1 {
    public static void main(String[] args) {
        int age = 20; // variable declaration + variable initialization
        String name = "abc";
        int a; // variable declaration
        System.out.println(age);
        System.out.println(name);
        //System.out.println(a);//CTE : local variables must be initialized before they are used
        int number1 = 100;
        int number2 = 200;
        //  System.out.println(add(number1, number2)); // 3000
        System.out.println(number1 + "\t" + number2);//100, 200
    }

    public static int add(int number1, int number2) {
        number1 = 1000;
        number2 = 2000;
        System.out.println(number1 + "\t" + number2);//1000 , 2000
        //System.out.println(age);//CTE --> age is defined in another method so it can't be accessed
        return number1 + number2;
    }
}
