
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Birthdays {

    public static void main(String[] args) {

        int day = 31;
        int month = 12;
        int year = 1990;

        System.out.println(collectBirthdays(year, month, day));

    }
    public static String collectBirthdays(int year, int month, int day) {
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - E");

        String result = "";

        int count = 0;

        while (birthday.isBefore(today) || birthday.isEqual(today)) {
            result += count + " - " + birthday.format(formatter) + System.lineSeparator();
            birthday = birthday.plusYears(1);
            count++;
        }
        return result;
    }
}
