enum DaysOfTheWeek{
  SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}

public class enums {
    public static void main(String[] args) {
   DaysOfTheWeek days =  DaysOfTheWeek.SATURDAY;
   if(days==DaysOfTheWeek.FRIDAY){
       System.out.println("Yah it,s almost Friday!");
   }
    }
}
