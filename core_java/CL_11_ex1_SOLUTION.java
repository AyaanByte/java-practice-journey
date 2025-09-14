

import java.util.Scanner;

public class CL_11_ex1_SOLUTION {
    public static void main(String[] args) {

     Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your physics marks:");
        int physics=scanner.nextInt();

        System.out.println("Enter your Chemistry marks:");
        int Chemistry=scanner.nextInt();

        System.out.println("Enter your English marks:");
        int English=scanner.nextInt();

        System.out.println("Enter your Mathematics marks:");
        int Math=scanner.nextInt();

        System.out.println("Enter your Science marks:");
        int Science=scanner.nextInt();

        float percentage=((physics+Chemistry+English+Science+Math)/500.0f)*100;
        System.out.println(percentage);



        System.out.println("Enter Your Physics Marks:");
        int physics2 = scanner.nextInt();



        System.out.println("Enter Your Mathematics Marks: ");
        int English23 = scanner.nextInt();


        float per = ((physics2+English23)/200.0f)*100;
        System.out.println(per);



    }
}
