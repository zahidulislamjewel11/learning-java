import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        DateTimeFormatter dtf;
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        String formattedDate = dtf.format(currentDate);
        System.out.println(formattedDate);
        System.out.println();
        
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);
        dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = dtf.format(currentTime);
        System.out.println(formattedTime);
        System.out.println();
        
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);        
        dtf = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
        String formattedDateTime = dtf.format(currentDateTime);
        System.out.println(formattedDateTime);
        System.out.println();
    }
}
