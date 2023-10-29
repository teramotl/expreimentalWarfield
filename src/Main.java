import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество ящиков: ");
        int totalBoxes = scanner.nextInt();
        scanner.close();

        int boxesPerContainer = 27;
        int containersPerTruck = 12;

        int trucksNeeded = (totalBoxes / (boxesPerContainer * containersPerTruck)) + 1;
        int containersNeeded = (totalBoxes / boxesPerContainer) + 1;

        System.out.println("Необходимо:");
        System.out.println("грузовиков - " + trucksNeeded + " шт.");
        System.out.println("контейнеров - " + containersNeeded + " шт.");

        int boxCount = 1;
        for (int truck = 1; truck <= trucksNeeded; truck++) {
            System.out.println("Грузовик: " + truck);
            for (int container = 1; container <= containersPerTruck; container++) {
                System.out.println("\tКонтейнер: " + container);
                for (int box = 1; box <= boxesPerContainer; box++) {
                    if (boxCount > totalBoxes) {
                        break;
                    }
                    System.out.println("\t\tЯщик: " + boxCount);
                    boxCount++;
                }
            }
        }





        /**String newLine = System.lineSeparator();

        productinfo product = new productinfo("Торт Наполеон", 1000);
        productinfo product1 = new productinfo("Молоко", 85);
        System.out.println("232" + newLine + "cheto");

        for (int i = 0; i < 65536; i++) {
            char c = (char) i;
            System.out.println(i + " - " + c);
        }
        System.out.println((char) 1025);*/
    }
}