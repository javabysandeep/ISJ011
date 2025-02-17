package _16_collection.sorting;

public class Demo1 {
    public static void main(String[] args) {
        //wrapper classes
        byte value = 10;
        Byte object = value; //auto-boxing - > converting primitive to object format
        byte value2 = object; //unboxing --> converting object to primitive format
        System.out.println(value);
        System.out.println(object);
        System.out.println(value2);

        System.out.println("parsing String ");
        String str ="10";
        byte parsedByte = Byte.parseByte(str);
        Byte objectFormat = Byte.valueOf(str);
        System.out.println(parsedByte);
        System.out.println(objectFormat);

        //String class


        //Custom objects
    }
}
