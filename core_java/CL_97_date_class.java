

import java.util.Date;

public class CL_97_date_class {
    public static void main (String [] args){
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(System.currentTimeMillis());

        Date dte = new Date();
        System.out.println(dte);
        // * Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this Date object.
        System.out.println(dte.getTime());
        // * These are deprecated methods -- which are no longer from java -8 onwards
        System.out.println("These are deprecated methods -- which are no longer from java -8 onwards");

         System.out.println(".getHours(): "+dte.getHours());
        System.out.println(".getMinutes(): "+dte.getMinutes());
        System.out.println(".getSeconds(): "+dte.getSeconds());
        System.out.println(".getDate(): "+dte.getDate());
        System.out.println(".getYear():"+dte.getYear());


    }
}
