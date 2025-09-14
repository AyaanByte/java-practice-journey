

import java.util.Scanner;

 // * This is custom exception-class
class MyException extends Exception{
    @Override
    public String toString(){
        return " I am toString()";
    }
    @Override
    public String getMessage(){
        return " I am getMessage()";
    }
}


public class CL_83_Exception_class {
    public static void main (String args[]){

         Scanner scan = new Scanner(System.in);
         int a = scan.nextInt();

         if(a<9){
             try{
                 // *  If (a>9) a is less than nine
                 // * it will throw an exception means error
                 // *  this MyException class which is custom-class

                 // ** The Throw keyword is used to throw an exception
                 // ** Especially by the programmer
                throw new MyException();
//                    throw new ArithmeticException("This is an Exception");
             }
             catch(Exception e){
                 System.out.println(e.getMessage());
                 System.out.println(e.toString());
                 System.out.println(e);
                 e.printStackTrace();
                 System.out.println("Finished");
             }


         }
    }
}
