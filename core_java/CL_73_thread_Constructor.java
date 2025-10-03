

class MyThr extends Thread{
      public MyThr(String name){
          super(name);
      }
      public void run(){
          int i = 45;
          System.out.println("Thank you");
        // while (true) {
         //   System.out.println("I am a thread ");
       // }
      }
}

public class CL_73_thread_Constructor {
    public static void main(String[] args) {
       MyThr thr1 = new MyThr("harry");
       MyThr thr2 = new MyThr("chandra");

       thr1.start();
       thr2.start();

        System.out.println("The   id of thread thr1 is  " + thr1.getId());
        System.out.println("The name of thread thr1 is  " + thr1.getName());

        System.out.println("The id of thread thr2 is " + thr2.getId());
        System.out.println("The name of thread thr2 is " + thr2.getName());



    }
}
