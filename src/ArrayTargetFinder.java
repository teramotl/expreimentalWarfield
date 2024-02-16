import java.util.ArrayList;
public class ArrayTargetFinder {

    public static void main(String[] args) {
        // Using an ArrayList to store strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        // Retrieve the exact fruit by name
        String targetFruit = "Banana";
        int index = fruits.indexOf("Banana");

        if (index != -1) {
            String exactFruit = fruits.get(index);
            System.out.println("Found " + targetFruit + " at index " + index);
            System.out.println("Exact Fruit: " + fruits.get(index));
        } else {
            System.out.println(targetFruit + " not found in the list.");
        }
    }
}
