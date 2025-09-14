

import java.util.Scanner;

public class CL_81 {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=66;

        Scanner sc = new Scanner(System.in);
         // * Input for Array Index :
        System.out.println("Enter the array index");
        int ind = sc.nextInt();

         // * Number-Input You want to divide the value with :
        System.out.println("Enter the number you want to divide the value with");
        int number = sc.nextInt();

        try{
            System.out.println("The value at array index entered is "+ marks[ind]);
            System.out.println("The Value Of array-value/number is :"+marks[ind]/number);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException Occurs :");
            System.err.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundException Occurs :");
            System.err.println(e);
        }
        catch(Exception e){
            System.out.println("Some Other Exception Occurs :");
            System.err.println(e);
        }
    }
}
