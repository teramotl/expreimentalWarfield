import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        System.out.println("Enter number:");

        int value = new Scanner(System.in).nextInt();

        int factorial = 1;
        for (int i = 1; i <= value; i = i + 1) {
            factorial = factorial * i;
        }

        System.out.println("factorial: " + factorial);
    }
}
