import java.util.Scanner;

public class StringToIntigerIguessIDktbh {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("vvedite pervoe");
        String first1 = scanner.nextLine();

        System.out.println("vvedite vtoroe");
        String second2 = scanner.nextLine();

        System.out.println("vvedite trete");
        String third3 = scanner.nextLine();

        int firstNum = Integer.parseInt(first1);
        int secNum = Integer.parseInt(third3);

        int result = 0;

        switch (second2) {
            case "+":
                result = firstNum + secNum;
                break;
            case "-":
                result = firstNum - secNum;
                break;
            case "*":
                result = firstNum * secNum;
                break;
            case "/":
                result = firstNum / secNum;
                break;
            default:
                System.out.println("wrong");



        }
        System.out.println(result);



    }
}
