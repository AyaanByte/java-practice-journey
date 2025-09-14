
import java.util.Scanner;

public class CL_18_elseIF {
    public static void main(String[] args) {

             // * PROBLEM-- 1
       /* System.out.println("Enter your age");
        int age;
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();

        if(age>56){
            System.out.println("You are experienced");
        }
        else if(age>46){
            System.out.println("You are semi-experienced");e
        }
        else if(age>36){
            System.out.println("You are semi-semi-experienced");
        }
        else{
            System.out.println("You are learner");
        }*/

          // * PROBLEM--2
  /*     System.out.println("Enter your age");
        int age;
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();

        switch(age){
            case 18:
                System.out.println("You are going to become an Adult!");
                break;
            case 23:
                System.out.println("You are going to join a job! ");
                break;
            case 60:
                System.out.println("You are going to get retired! ");
                break;
            default:
                System.out.println("Enjoy your life!");

        }
              System.out.println("Thanks for using my java Code!");
*/
        // * PROBLEM--3
      /* byte m1,m2,m3;
        Scanner scan =new Scanner(System.in);

        System.out.println("Enter Your marks in physics");
        m1=scan.nextByte();

        System.out.println("Enter Your marks in Math");
        m2=scan.nextByte();

        System.out.println("Enter Your marks in Science");
        m3=scan.nextByte();

        float average =(m1+m2+m3)/3.0f;

        if(average>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulations!,\n You have been promoted");
        }else{
            System.out.println("Sorry,\n You have not been promoted!!\nPlease Try again");

        }*/


      // * PROBLEM-5 > Switch case day
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Day number as 1 to 7 :- ");
         int day=sc.nextInt();


        switch (day){
             case 1 -> System.out.println("Monday");
             case 2 -> System.out.println("tuesday");
             case 3 -> System.out.println("Wednesday");
             case 4 -> System.out.println("Thursday");
             case 5 -> System.out.println("Friday");
             case 6 -> System.out.println("Saturday");
             case 7 -> System.out.println("Sunday");
         }
        System.out.println(day);


        // * Q7-> Write a program to find out the type of website from the url
        // .com =commercial website
        // .org =organization website
        //  .in =indian  website

        // * ANS 7
       /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter website urls:");
        String website = sc.next();
      if(website.endsWith(".org")){
            System.out.println("This is Organization website ");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is Commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is Indian website");
        }else{
            System.out.println("Please type valid URL:");
        }
        */







    }
}
