

import java.util.InputMismatchException;
import java.util.Scanner;

class myException extends Exception{
    public String toString(){
        return "\t***>>> Only 5 attempts <<<***";
    }
}
public class CL_86_PS_Qs_4 {

    public static void main(String []args){
        // * Question - 4
        // * Write a program that allows you to keep accessing an array until a valid index is given
        // * If max Retried exceed 5 print "Only 5 attempts"
        // * & Throw a custom Exception - if max retries are reached

        int marks[] ={9,56,89};
        Scanner scan = new Scanner(System.in);
        int index;
        int i =0;


        while(i<5){
            try{
                System.out.println("Enter Array Index :-");
                index = scan.nextInt();
                System.out.println("The Index value of marks is :" + marks[index]);
                break;
            }
            catch(InputMismatchException e){
                System.err.println("Input Mismatch Exception");
                System.out.println(e);
                break;
            }
            catch(Exception e){
                System.err.println("Invalid Input : --> Exception Occur <--");
                i++;
                if(i>=5){
                    System.out.println(e);
                }
            }
            finally {
                if(i>=5){

                    try{
                        throw new myException();
                      }
                    catch(Exception e){
                        System.err.println(e.toString());
                    }
                }
            }
         }

    }
}
