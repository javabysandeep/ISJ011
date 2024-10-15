package operators.assignments;

public class Demo4SwappingUsingThirdVariable {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        System.out.println("before swap " + x + "\t" + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("after swap " + x + "\t" + y);
    }
}
