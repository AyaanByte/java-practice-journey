

import java.time.*;
import java.time.format.DateTimeFormatter;

public class CL_101_dateTimeFormatter {
    public static void main(String[]args){
        // * We can print local date & time using LocalDateTime method
        // * What if we want to print custom Local datetime format
        // * For that we Have DateTimeFormatter method for print custom datetime format

        LocalDateTime dt = LocalDateTime.now(); // This is the date
        System.out.println("Local Date :- "+dt);

         //         ***>> Different Types of date Formats  <<***
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy -- E H:m a");  // This is the Custom Format
        DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // This is the Custom Format
        DateTimeFormatter df2 =  DateTimeFormatter.ISO_LOCAL_DATE;         // This is ISO_local_date format

        //       **>> Creating date(myDate) string using DateTime-Formatter <<**
        String myDate = dt.format(df);
        String myDate1 = dt.format(df1);
        String myDte2 = dt.format(df2);
        //           **>> Printing date string <<**
        System.out.println("DateFormat(dd-MM-yyyy) :"+myDate);
        System.out.println("DateFormat(dd/MM/yyyy) :"+myDate1);
        System.out.println("ISO_local_Date_Format :"+myDte2);

        // **>> Stores a date & time with a Time-Zone <<**
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);


        LocalDate ldt = LocalDate.now();

        // The epoch year LocalDate, '1970-01-01'.
        System.out.println(ldt.EPOCH);

        //The maximum supported LocalDate, '+999999999-12-31'.
        System.out.println(ldt.MAX);

        //The minimum supported LocalDate, '-999999999-01-01'.
        System.out.println(ldt.MIN);

        System.out.println(ldt.getChronology());
    }
}