

import java.util.Scanner;

public class CL_79_errorsDemo {
    public static void main(String[] args) {

                // * Syntax Error Demo
         // int a = 9    -->        without semicolon it is syntax error
         //  b = 7;     ---> without declaration it is also syntax error


           // * Logic error Demo
        // we are printing prime number but it is printing
        // 2,3,5,7,9 -- so here 9 is not a prime number it is a logic err

       /* System.out.println(2);
        for(int i=1; i<5; i++){

            System.out.println(2*i+1);
        }
       */

            // * RUNTIME ERROR
            // * IF we print input as 0 it will produce error
            // * that 1000 cant divide by 0  -- so it produce a error
        int  k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
          //  * For this we will have to use Try-Cache block
/*        try{
            System.out.println("1000 Divided by K is :" + 1000/k);
            System.out.println(1000%k);
        }
        catch (Exception e){
            System.out.println("You Have Enter : 0");
            System.out.println("0 is not divisible by any Number");

        }*/



    }

}
