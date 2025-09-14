
               //  *->>> Creating a thread ➡➡➡➡➡>
          /*       *->>> There are two ways to create a thread in java
           *  1. By extending Thread class          ➡➡➡➡> that we have done in previous class
           *  2. By implementing Runnable interface ➡➡➡➡> that we have done in this programme*/


class myThreadRunnable1 implements Runnable{
    @Override
      public void run(){
          for(int i=0; i<=10000;i++) {
              System.out.println("I am a thread1 not a threat1 🔹🔷🔹🔷🔹🔷🔹");
          }
      }
}
class myThreadRunnable2 implements Runnable{
    @Override
      public void run(){
          for(int i=0; i<=10000;i++) {
      System.out.println("I am a thread2 not a threat2 🔻🔺🔻🔺🔻🔺");
          }
        }
}

public class CL_71_threads_runnable {
    public static void main(String[] args) {

       myThreadRunnable1 bullet1 = new myThreadRunnable1();
       myThreadRunnable2 bullet2 = new myThreadRunnable2();

       Thread gun1 = new Thread(bullet1);
       Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();



    }
}
