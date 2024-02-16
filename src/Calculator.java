import java.util.Random;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int correctNum = random.nextInt(100)+1;

        System.out.println("guess the number!");
        int guessNum = scanner.nextInt();

        if (correctNum == guessNum) {
            System.out.println("correct!!!");
        } else {
            System.out.println("correct num was: " + correctNum + "\n" + "try again (");
        }
    }
}
