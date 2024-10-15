package operators.assignments;

public class Demo12IsAlphabet {
    public static void main(String[] args) {
        char ch = 'Z';
        System.out.println(
                (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')
                        ? "its alphabet"
                        : "not an alphabet"
        );
        float number = -123.56f;
        System.out.println(Math.abs(number));//123.56
    }
}
