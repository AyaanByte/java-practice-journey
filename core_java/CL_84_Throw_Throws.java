
  // * The Throw keyword is used to throw an exception
  // * Especially by the programmer

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be Negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be Negative!";
    }

}


public class CL_84_Throw_Throws{

    // * This divide function is Made by --Alice
    public static int divide(int a, int b) throws ArithmeticException{
        return a/b;
    }

    public static double area(int r) throws NegativeRadiusException {
        if(r<=0){
            throw new NegativeRadiusException();
        }
        return Math.PI * r * r;
    }


public static void main(String[] args) {

       // * Shivam - uses divide function which is Made by --Alice
      try{
          int c = divide(6,0);
          System.out.println(c);

       }
      catch(Exception e){
          System.out.println("Q1 * Arithmetic Exception :-\nNumber can't divide by 0 ");
      }


     try{
         double area = area(0);
         System.out.println(area);
     }
    catch(Exception e){
        System.out.println("Q2 * Exception:-");
        System.out.println(e.getMessage());
    }









    }
}
