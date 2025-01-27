package _12_String_handling;

public class Demo16Reverse {
    public static void main(String[] args) {
       //way 3: char array
        String str = "kunal,vinit,suyog,kajal,shivani";
        char[] charArray = str.toCharArray();
        for (int left = 0, right= charArray.length-1; left <right ; left++, right--) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
        }
        // they will print the array
        //student will convert that into
        String reverse  = new String(charArray);
        System.out.println(reverse);



    }
}
