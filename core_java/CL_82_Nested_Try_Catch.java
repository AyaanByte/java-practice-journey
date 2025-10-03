

import java.util.Scanner;

public class CL_82_Nested_Try_Catch {
    public static void main(String[] args) {
        int marks[]= new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=66;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Index No:");
        int index =scan.nextInt();

      try{
       System.out.println("Welcome To Class no 82");
         try{
             System.out.println(marks[index]);
         }
         catch(ArrayIndexOutOfBoundsException e){
             System.out.println("Sorry This Index Does Not Exist");
             System.out.println("Exception In Level: 2");
          }
      }
      catch(Exception e){
          System.out.println("Exception In level: 1");
      }
    }
}
