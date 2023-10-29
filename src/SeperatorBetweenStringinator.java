public class SeperatorBetweenStringinator {


    public static void main(String[] args) {
        String str1 = "lets say something";
        String str2 = "lets not something";
        String str3 = "lets shutup something";

        System.out.println(getBetween(str3));
    }

    public static String getBetween(String str){
        String lets = "lets";
        int start = str.indexOf(lets) + lets.length();
        int end = str.indexOf("something", start);
        String between = str.substring(start,end);
        return between;
    }
}
