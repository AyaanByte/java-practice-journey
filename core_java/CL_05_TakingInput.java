
 import java.util.Scanner;
//  * import java.util.*;   <-- This will import all method  No need to import any method in utils




public class CL_05_TakingInput{



       public static void main(String[]args){

           Scanner scan = new Scanner (System.in);

           System.out.println("Enter Your Name :");
           String name=scan.next();

           System.out.println("Taking Input from User");

           System.out.println("Enter The number 1");
            int a = scan.nextInt();


           System.out.println("Enter The Number 2");
           int b = scan.nextInt();

           int c = a+b;
           System.out.format("%S The Sum of Numbers Is :\n",name);
           System.out.println(c);
       }




}




