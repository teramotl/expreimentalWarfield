import java.util.Arrays;
import java.util.HashMap;

public class Anagram {
    public boolean isAnagram (String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        char[] charArray = {'c', 'a', 'd', 'b'};

        Arrays.sort(charArray);


        System.out.println("Sorted char array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }


}
