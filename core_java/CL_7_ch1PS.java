

import java.util.Scanner;

public class CL_7_ch1PS {
    public static void main(String[] args) {

        // * Question 1
        int a=4;
        int b=5;
        int c=8;
        int sum=a+b+c;
        System.out.println(sum);

        // * Question 2
        float subject1=45;
        float subject2=95;
        float subject3=48;
        float cgpa=(subject1+subject2+subject3)/30;
        System.out.println(cgpa);


        // * Question 3
        System.out.println("What is your name");
        Scanner scan1=new Scanner(System.in);
        String name =scan1.next();
        System.out.println(" Hello " +name +" Have a good day!");




//      *  Question 4
        System.out.println("Enter your number");
        Scanner scan2=new Scanner(System.in);
        System.out.println(scan2.hasNextInt());




    }
}
