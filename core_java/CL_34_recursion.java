

public class CL_34_recursion {
     // * Recursion: A function in java can called itself such calling of function by itself its called RECURSION
    //  * Factorial(0)=1  --- Factorial(5)=5*4*3*2*1=12  --  factorial= n* n-1


    static int factorial(int n){
         if(n==0 || n==1){
             return 1;
         }else {
             return n*factorial(n-1);
         }
    }


    static int factorial_iterative(int n){
        if(n==0 || n==1){
            return 1;
        }else {
          int product=1;
          for(int i=1; i<=n;i++){ //1 to n
            product *= i;
          }
          return product;
        }
    }

   public static void main(String [] args){
//        int n=4;
        System.out.println("The factorial of n is: "+ factorial(4));
        System.out.println("The factorial of n is: "+ factorial_iterative(5));

    }
}
