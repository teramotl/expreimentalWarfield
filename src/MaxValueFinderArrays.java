public class MaxValueFinderArrays {
    public static void main(String[] args) {
        int[] numbers = {11, 223, 33, 41, 5421, 1, 124, 12, 32};
        int maxValue = numbers[0];  // Start with the first element as the maximum

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];  // Update the maximum value
            }
        }

        System.out.println("The maximum value is: " + maxValue);
    }
}
