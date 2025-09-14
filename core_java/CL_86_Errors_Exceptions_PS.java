

import java.util.InputMismatchException;
import java.util.Scanner;

public class CL_86_Errors_Exceptions_PS {
    public static void main (String []args){
        // * Problem 1 - Syntax , Logical and runtime error

         // * int a = 7  -->  syntax error
         // * int age = 78;
         // * int year_born = 2000-78; --> Logical error
         // * System.out.println(6/0); --> runtime error

        // * Question-2 --> Write a program that prints "HaHa" - During arithmetic expression
        // * & "HeHe" during an Illegal argument exception

       /*  try{
            int a =999/0;
        }
        catch(IllegalArgumentException e){
            System.out.println("HaHaHa -- Illegal Argument Exception ");
        }
        catch(ArithmeticException e){
            System.out.println("HeHeHe -- Arithmetic Exception");
        }
       */

        // * Question -3 -->  Write a program that allows you to keep accessing an array until a valid index is given
        // * If max Retried exceed 5 print "Error"


        int marks[] = new int [3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;

        Scanner scanner = new Scanner(System.in);
        int index;
        int i = 0;

        if(i==0){
            System.out.println("Only 5 attempt --");
        }

        while(i<5){
            try{
                System.out.println("Enter the value of array index :");
                index = scanner.nextInt();
                System.out.println("The Value of marks[index] is " + marks[index]);
                break;
            }
            catch(InputMismatchException e){
                System.out.println("Input Mismatch");
                System.err.println(e);
              break;

            }

            catch(Exception e){
                System.err.println("Invalid Index");
                 i++;
                 if(i>=5){
                    System.out.println(e);
                }
            }



        }



    }
}
