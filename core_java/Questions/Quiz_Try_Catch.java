

import java.util.Scanner;

public class Quiz_Try_Catch {
    public static void main(String[] args) {
        // --Array
        int marks[] = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2]= 66;

        // --Scanner scan
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Index No:-");

        // --Boolean true
        boolean flag = true;


        // While(flag) - flag = true(Infinite)
       while(flag) {
            // -- input
           int index = scan.nextInt();
           // -Try
           try {
               System.out.println("Nested-Try-Catch  --Quiz");
            // Nested-Try-catch
               try {
                   // Marks index through input
                   System.out.println(marks[index]);
                   // if marks index is present in array - flag = false (whileloop = false)
                   flag = false;
               }
               // If marks index is not present in array - arrayIndexOutOfBounds exception
               catch (ArrayIndexOutOfBoundsException e) {
                   System.out.println("Sorry This Index Does Not Exist");
                   System.out.println("Exception Level : 2");
               }
           }
           catch (Exception e) {
               System.out.println("Exception Level : 1");
           }
       }



       System.out.println("Thanks For Using This Program");

    }
}
