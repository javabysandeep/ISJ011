package _12_String_handling;

public class Demo18StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("good ");
        //StringBuilder sb = "abc";//CTE
        stringBuilder.append(" morning");
        System.out.println(stringBuilder); //good morning

        stringBuilder.insert(2," hello ");
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);


        stringBuilder.deleteCharAt(0);
        System.out.println(stringBuilder);

        stringBuilder.delete(0,5);
        System.out.println(stringBuilder);
    }
}
