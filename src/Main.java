public class Main {
    public static void main(String[] args) {
        String newLine = System.lineSeparator();

        productinfo product = new productinfo("Торт Наполеон", 1000);
        productinfo product1 = new productinfo("Молоко", 85);
        System.out.println("232" + newLine + "cheto");

        for (int i = 0; i < 65536; i++) {
            char c = (char) i;
            System.out.println(i + " - " + c);
        }
    }
}