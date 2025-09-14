

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class CL_102_practiceSet {
    public static void main(String[]args){
////////////////////////////////////////////////////////////////////////////////////////////////
        // * Ps Q1 -- create an arrayList and store names of 10 students inside it
        // * -- print it using for-each loop

        ArrayList ar = new ArrayList();
        ar.add("Student 1");
        ar.add("Student 2");
        ar.add("Student 3");
        ar.add("Student 4");
        ar.add("Student 5");
        ar.add("Student 6");
        ar.add("Student 7");
        ar.add("Student 8");
        ar.add("Student 9");
        ar.add("Student 10");

     for(Object o:ar){
         System.out.println(o);
     }
////////////////////////////////////////////////////////////////////////////////////////////////
     // * PS Q2 -- Use the date class in java to print time in the following format : 21:47:02

        Date d = new Date();
        System.out.println("Using Date Class *> "+d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

////////////////////////////////////////////////////////////////////////////////////////////////
        // * PS Q3 -- Use the Calendar class in java to print time in the following format : 21:47:02

        Calendar calendar = Calendar.getInstance();
        System.out.println("Using Calendar Class *> "+calendar.get(Calendar.HOUR_OF_DAY) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
////////////////////////////////////////////////////////////////////////////////////////////////
        // * PS Q4 -- Use the java.time API to print time in the following format : 21:47:02

           LocalDateTime ldt = LocalDateTime.now(); // * This is the time
           DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("H:m:s"); // * This is the custom format
           String myTime = ldt.format(dateTimeFormatter);// * storing time in string myTime() using dateTime Format
           System.out.println("Using java.time API *>" +myTime);  // * printing custom date s

////////////////////////////////////////////////////////////////////////////////////////////////
        // * PS Q5 - Create a HashSet in java - Try to store duplicate elements inside this HashSet
        // * -- and verify that only one instance is stored
        //  * HashSet hst = new HashSet(); <<**OR**>> HashSet<Integer> hst = new HashSet();
        HashSet<Integer> hashset = new HashSet();
        hashset.add(5);
        hashset.add(6);
        hashset.add(46);
        hashset.add(60);
        hashset.add(9);
        hashset.add(6);
        System.out.println(hashset);


////////////////////////////////////////////////////////////////////////////////////////////////



    }
}
