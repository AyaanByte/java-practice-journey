
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CL_100_Java_Time {
    public static void main(String[]args){
       // Local Date
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
       // Local Time
        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        // Local Date&Time
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);


    }
}
