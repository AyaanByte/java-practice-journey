

public class CL_85_Finally {

    /*       --* JAVA-Finally-Block *--
     *  Finally block contain the code which is
     *  always executed whether the exception is handled
     *  or not . It is used to execute code containing
     *  instructions to release the system resources ,
     *  close a connection etc
     **/

    public static int greet(){
        try {
            int a = 50;
            int b = 10;
            int c = a / b;
            return c;
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("This is the end of this function");
        }
        return 0;
    }
    public static void main(String[]args) {
       int k =greet();
       System.out.println(k);
       int a = 7;
       int b = 9;
       while(true){
           try{
               System.out.println(a/b);
           }
           catch(Exception e){
               System.out.println(e);
               break;
           }
           finally{
             System.out.println("I Am Finally for value of b = "+b);
           }
           b--;
       }

       // * It is trying to divide by 0 -
       // * there is not catch block -- so it will not handle exception
       // * because divide by 0 it is exception in java
       // * and after try block it is going to finally block
       // * If there is exception or not but finally block will always run for you



       try{
           System.out.println(50/10);
       }
       finally{
           System.out.println("The Finally printed");
       }
    }
}
