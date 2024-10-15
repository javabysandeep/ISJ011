package operators.assignments;

public class Demo3Result {
    public static void main(String[] args) {
        int subject1 = 78;
        int subject2 = 45;
        int subject3 = 62;
        int totalScored = subject1 + subject2 + subject3;
        float totalMarks = 300;
        float percentage = totalScored / totalMarks * 100;
        System.out.println("Total Scored marks " + totalScored);//185
        System.out.println("Percentage " + percentage);//61.6666
    }
}
