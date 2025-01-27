package _12_String_handling;

public class Demo19StringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("good ");
        //StringBuffer sb = "abc";//CTE
        stringBuffer.append(" morning");
        System.out.println(stringBuffer); //good morning

        stringBuffer.insert(2," hello ");
        System.out.println(stringBuffer);

        stringBuffer.reverse();
        System.out.println(stringBuffer);


        stringBuffer.deleteCharAt(0);
        System.out.println(stringBuffer);

        stringBuffer.delete(0,5);
        System.out.println(stringBuffer);
    }
}
