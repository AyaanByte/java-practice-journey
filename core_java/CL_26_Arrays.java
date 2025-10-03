

import java.awt.*;

public class CL_26_Arrays {
    public static void main(String[] args) {
                // * ARRAYS *
        /*
            * There is Classroom of 500 students - You have to store marks of these 500 students
            * You have two options
            * 1. Create 500 Variables
            * 2. Use Arrays (Recommended)
        */

          // * There are three main ways to create an arrays in java
          // * 1. Declaration! + memory Allocation! together

//      int []marks =new int[5];
//        marks[0]=100;
//        marks[1]=86;
//        marks[2]=70;
//        marks[3]=59;
//        marks[4]=46;
//      System.out.println(marks[4]);

          // * 2. Declaration and then memory allocation and then initialization
//           int []marks;
//           marks = new int[5];
//           //Initialization
//           marks[0]=100;
//           marks[1]=86;
//           marks[2]=70;
//           marks[3]=59;
//           marks[4]=46;
//        System.out.println(marks[4]);

           // * 3.Declaration! +Memory allocation! + Initialization! together
//         int []marks={34,67,98,45,23};
//         System.out.println(marks[4]);

           // * Array length  --> Array.length will give the size of array
      /*  int []marks1={34,89,67,49,59};
        System.out.println(marks1.length);
        System.out.println(marks1[4]);*/

        /*float []marks={98.5f,45.5f,39.5f,87.5f,79.5f};
        System.out.println(marks.length);
        System.out.println(marks[4]);*/

       /* String []students={"Harry","Rohan","shubham","lavish","Any"};
        System.out.println(students.length);
        System.out.println(students[2]);*/


          int []marks={34,89,67,49,59};

        // * Displaying or printing  Array in a (Naive way)- simple way
        System.out.println("Printing using naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

       // * printing Array (For loop)➡➡➡➡➡➡ Recommended
        System.out.println("Printing using for loop");
        for(int i=0;i<marks.length;i++){
           System.out.println(marks[i]);
        }

      // *  Quick Quiz: Printing array in reverse order (for loop)
        System.out.println("Printing using reverse order in for loop");
        for(int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }


        // * Printing the  array  (for-each loop)
        System.out.println("Printing using for-each loop");
       for(int element:marks){
           System.out.println(element);
        }




    }
}
