
import java.util.*;
public class CL_16_Conditionals {
    public static void main(String[] args) {
      // * Scanner with name and age input

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name");
        String name= scan.next();
        System.out.println("Type your age");
        int age=scan.nextInt();


        if (age>=18){
            System.out.format("Yes %S you can drive Vehicle ",name);
        }
        else if(age==17){
            System.out.format("From Next Year\n you can drive %S",name);
        }

        else{
            System.out.format("No you cant drive %S\n After 18yr",name);
        }



    }
}
