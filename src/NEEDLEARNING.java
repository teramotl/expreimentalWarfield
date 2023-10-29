
public class NEEDLEARNING {
    public static void main(String[] args) {
        String inputText = "Это просто текст, для примера работы программы";
        String result = sequentialWordsNumbers(inputText);
        System.out.println(result);
    }

    public static String sequentialWordsNumbers(String text) {
        StringBuilder resultBuilder = new StringBuilder();
        int wordCount = 0;
        int startIndex = 0;

        while (startIndex < text.length()) {
            int spaceIndex = text.indexOf(" ", startIndex);

            if (spaceIndex == -1) {
                spaceIndex = text.length();
            }

            String word = text.substring(startIndex, spaceIndex);
            resultBuilder.append("(").append(++wordCount).append(") ").append(word);

            if (spaceIndex < text.length() - 1) {
                resultBuilder.append(" ");
            }

            startIndex = spaceIndex + 1;
        }

        return resultBuilder.toString();
    }

}
