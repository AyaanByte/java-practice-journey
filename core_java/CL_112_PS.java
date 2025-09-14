

import java.io.FileWriter;
import java.io.IOException;

class MyDeprecated{
    @Deprecated
    public void meth1(){
        System.out.println("I am meth 1");
    }
}

// QS-4
interface MyInterface{
    void display();
}

public class CL_112_PS {
   // * Q_3 -- suppress the generated warnings on meth1()
   @SuppressWarnings("deprecation")

    public static void main(String[]args){

        // * QS_2 -- Create a class and add a method with deprecated annotation.
        // * What is its effect on program executions ?
        // * -> nothing effect on program execution. because it is  giving only warning.
         MyDeprecated myDeprecated = new MyDeprecated();
         myDeprecated.meth1();

         // * Q_4 -- Create an interface and generate an instance from it .
            MyInterface myInterface = () -> System.out.println("I am Display");
            myInterface.display();

         // * Q_5 -- Write a program to generate multiplication table of a given number and write it to a file


       try {
           FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
           int i = 5;
           String table = "";

           for(int s=1; s<=10; s++){
               table += " * " + i + "X" + s + "=" + i*s + "\n";

           }
           fileWriter.write(table);

           fileWriter.close();
       } catch (IOException e){
           e.printStackTrace();
       }




    }

}
