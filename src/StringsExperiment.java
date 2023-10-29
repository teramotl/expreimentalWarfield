import java.util.Scanner;

public class StringsExperiment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the first word: ");
            String string1 = scanner.nextLine();

            System.out.println("Enter the second word: ");
            String string2 = scanner.nextLine();

            boolean isEqual = string1.equals(string2);

            if (isEqual) {
                System.out.println("POG");
            } else {
                System.out.println("L");
            }
        }
    }
}
