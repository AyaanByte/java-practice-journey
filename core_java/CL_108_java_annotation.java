
import java.util.logging.Logger;

@FunctionalInterface
// * Functional Interface annotation -
// * An Interface that contains exactly one
// * abstract method is known as a functional interface.

interface myFunctionalInterface{
    void thisMethod();

//void thisMethod2(); --> not allowed because of FunctionalInterface annotation
}



class NewPhone extends Phone{

    @Override
   public void showTime(){
       System.out.println("Time is 8 PM");
   }
   @Deprecated
   public int sum(int a, int b){
        return a+b;
   }

}


public class CL_108_java_annotation {
    @SuppressWarnings("deprecation")
// * The @SuppressWarnings in Java is an annotation that is used to
// * inform the compiler to suppress specified warnings for a certain
// * part of the program
    public static void main(String []args){

      NewPhone phone = new NewPhone();
      phone.showTime();

      phone.sum(5,6);
            
    }
}
