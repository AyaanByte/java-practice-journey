

           // ***> Dynamic Method Dispatch

 class Phone{

     public void showTime(){
         System.out.println("Time is 8 a.m");
     }

     public void on(){
         System.out.println("Turning on phone...");
     }

 }

 class SmartPhone extends Phone{

     public void music(){
         System.out.println("Playing Music ");
     }

     public void on(){
         System.out.println("Turning on SmartPhone ( ͡❛ ͜ʖ ͡❛)");
     }




 }

public class CL_49_Dynamic_method_dispatch {
    public static void main(String[] args) {
        /*Phone obj = new Phone();
        SmartPhone smobj = new SmartPhone();
        obj.name();*/

        Phone obj = new SmartPhone();  //-- ALLOWED
      // SmartPhone obj2 = new Phone();  //-- NOT_ALLOWED

        obj.showTime();
        obj.on();
        //obj.music(); - NOT ALLOWED




    }
}
