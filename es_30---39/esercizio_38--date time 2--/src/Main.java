import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
            LocalDateTime currentDateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(" dd LLLL yy HH:mm ");
            System.out.println(currentDateTime.format(formatter));
            ZonedDateTime currentDateTimeZ = ZonedDateTime.now();
            System.out.println(currentDateTimeZ.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
    }
}