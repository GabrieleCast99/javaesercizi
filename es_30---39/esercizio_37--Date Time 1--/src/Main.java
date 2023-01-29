import java.time.LocalDate;
import java.time.Year;
public class Main {
    public static void main(String[] args) {
        LocalDate day = LocalDate.now();
        int endMonth = day.lengthOfMonth() - day.getDayOfMonth();
        System.out.println("Remaining days before the end of the month: " + endMonth);
        int endYear = Year.of(day.getYear()).length() - day.getDayOfYear();
        System.out.println("Remaining day before the end of the year: " + endYear);
    }
}