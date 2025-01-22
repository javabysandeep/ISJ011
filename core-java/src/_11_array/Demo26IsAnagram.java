package _11_array;

public class Demo26IsAnagram {
    public static void main(String[] args) {
        char[] array1 = {'a', 'a', 'c'};
        char[] array2 = {'a', 'c', 'a'};
        boolean isAnagram = true;
        if (array1.length != array2.length || array1 == null || array2 == null) {
            isAnagram = false;
        }
        for (int i = 0; i < array1.length; i++) {
            char X = array1[i];
            boolean isFound = false;
            for (int j = 0; j < array2.length; j++) {
                if(X==array2[j]){
                    array2[j] = '0';
                    isFound = true;
                    break;
                }
            }
            if(!isFound){
                isAnagram = false;
            }
        }
        System.out.println(isAnagram ? "anagram" : "not a anagram");
    }
}
