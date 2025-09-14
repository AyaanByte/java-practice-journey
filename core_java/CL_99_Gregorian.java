
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CL_99_Gregorian {
    public static void main(String []args){

    Calendar c = Calendar.getInstance();

    System.out.println(c.getTime());
    System.out.println("Date --> "+c.get(Calendar.DATE));
    System.out.println("Seconds --> "+c.get(Calendar.SECOND));
    System.out.println("12-hour clock Time--> "+c.get(Calendar.HOUR));
    System.out.println("24-hour clock Time:");
    System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
    System.out.println("ERA:"+c.get(Calendar.ERA));


    GregorianCalendar gCal = new GregorianCalendar();
    System.out.println(gCal.isLeapYear(2024));
        // * World timeZone IDs
        String tzs[] = TimeZone.getAvailableIDs();
        // * printing the available TimeZone ID's
        for(int i=0; i<tzs.length; i++){
            System.out.println(tzs[i]);
        }

//         get the supported ids for GMT-08:00 (Pacific Standard Time)
        String[] ids = TimeZone.getAvailableIDs(-8 * 60 * 60 * 1000);
      for(int i=0; i<ids.length; i++){
          System.out.println(ids[i]);
      }

    }
}
