

 class Employee{
      int salary;
      String name;

         public int getSalary(){
            return salary;
        }
         public String getName(){
            return name;
        }
         public void setName(String n){
            name=n;
        }
  }


  class cellPhone{
     public void ring(){
         System.out.println("Ringing...");
     }
     public void vibrate(){
         System.out.println("Phone Vibrating...");
     }
     public void callFriend(){
         System.out.println("Calling to friend...");
     }
  }

  class cellone{
     public void ring(){
         System.out.println("R¡ńƓ¡ńƓ...");
         System.out.println("»");
         System.out.println("♛ »");
         System.out.println("♛♛ »");
         System.out.println("♛♛♛ »");
         System.out.println("♛♛♛♛ »");
         System.out.println("♛♛♛♛♛ »");
         System.out.println("♛♛♛♛♛♛ »");
         System.out.println("♛♛♛♛♛ »");
         System.out.println("♛♛♛♛ »");
         System.out.println("♛♛♛ »");
         System.out.println("♛♛ »");
         System.out.println("♛ »");
         System.out.println("»");
     }
  }

  class square{
     int side;
       public int area(){
           return side*side;
       }
       public int perimeter(){
           return 4*side;
       }
  }

 class tommy{
     public void hit(){
         System.out.println("Hitting the enemy");
     }
     public void run(){
         System.out.println("Running from the enemy");
     }
     public void fire(){
         System.out.println("Firing to the enemy");
     }

 }

public class CL_39_CH8_PS {
    public static void main(String[] args) {

        cellone cell = new cellone();
        cell.ring();

        // * PRACTICE Problem- 1
//        Employee alice = new Employee();
//        alice.salary=234;
//        alice.setName("Alice Liddle");
//        System.out.println(alice.getName());
//        System.out.println(alice.getSalary());

        // *  PRACTICE Problem- 2
//         cellPhone berry = new cellPhone();
//          berry.callFriend();
//          berry.vibrate();
//          berry.ring();

//       // *-> PRACTICE Problem- 3
         square sq =new square();
         sq.side=8;
         System.out.println(sq.area());
         System.out.println(sq.perimeter());


         // * PRACTICE Problem- 5
//         tommy player1 = new tommy();
//         player1.fire();
//         player1.hit();
//         player1.run();
    }
}
