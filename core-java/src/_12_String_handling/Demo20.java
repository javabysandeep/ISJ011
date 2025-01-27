package _12_String_handling;

public class Demo20 {
    public static void main(String[] args) {
        //String into StringBUidler & StringBuffer
        String str1 = "abc";
        StringBuilder stringBuilder = new StringBuilder(str1);
        StringBuffer stringBuffer = new StringBuffer(str1);
        System.out.println(str1);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer);
        //StringBUilder or StringBuffer into String
        String str2 = new String(stringBuilder);
        String str3 = new String(stringBuffer);
        System.out.println(str2);
        System.out.println(str3);
    }
}
