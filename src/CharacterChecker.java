public class CharacterChecker {
    public static void main(String[] args) {

//These methods are useful for character-level validation and processing in Java applications.
// You can use them to determine the characteristics of individual characters in strings,
// which can be handy for text processing and validation tasks.

        char ch = '5';
        if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit.");
        } else {
            System.out.println(ch + " is not a digit.");
        }
        //5 is a digit.
//----------------------------------------------------------------------------------------------------------------------
        char ch2 = 'A';
        if (Character.isLetter(ch2)) {
            System.out.println(ch2 + " is a letter.");
        } else {
            System.out.println(ch2 + " is not a letter.");
        }
        //A is a letter.
//----------------------------------------------------------------------------------------------------------------------
        char ch3 = '好';
        if (Character.isIdeographic(ch3)) {
            System.out.println(ch3 + " is an ideographic character.");
        } else {
            System.out.println(ch3 + " is not an ideographic character.");
        }
        //好 is an ideographic character.
//----------------------------------------------------------------------------------------------------------------------
        char ch4 = 'x';
        if (Character.isJavaLetterOrDigit(ch)) {
            System.out.println(ch4 + " is a valid Java identifier character.");
        } else {
            System.out.println(ch4 + " is not a valid Java identifier character.");
        }
        //x is a valid Java identifier character.
//----------------------------------------------------------------------------------------------------------------------
    }
}
